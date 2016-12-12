package test;

/**
 * Test the shopping cart
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.CartManager;
import model.CartService;
import model.CustomerManager;
import model.CustomerService;
import model.FirstCheckOut;
import model.InsufficientFunds;
import model.InsufficientStock;
import model.InvalidOrderAmount;
import model.Manufacturer;
import model.QuantifiedArticles;
import model.ShopService;
import model.ShopkeeperService;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentCartManager;
import persistence.PersistentCheckedOut;
import persistence.PersistentCustomerManager;
import persistence.PersistentCustomerService;
import persistence.PersistentManufacturer;
import persistence.PersistentOpenCart;
import persistence.PersistentQuantifiedArticles;
import persistence.PersistentShopService;
import persistence.Predcate;

public class TestCart {
	PersistentCustomerManager cm;
	PersistentCustomerService cs;
	PersistentArticle a1;
	PersistentArticle a2;
	PersistentArticle a3;
	PersistentManufacturer m1;
	PersistentShopService pss;

	@Before
	public void setUp() throws PersistenceException {
		TestSupport.prepareSingletons();
		try {
			TestSupport.prepareDatabase();
		} catch (PersistenceException | SQLException | IOException e) {
			fail();
		}
		cm = CustomerManager.createCustomerManager();
		cs = CustomerService.createCustomerService(cm);
		m1 = Manufacturer.createManufacturer("M1", 1000);
		a1 = Article.createArticle("A1", m1, 100, 10, 150);
		pss = ShopService.createShopService(cm);
		a1.setStock(100);
		cm.getCartMngr().addArticle(a1, 10);
		a2 = Article.createArticle("A2", m1, 20, 5, 60);
		a2.setStock(34);
		a3 = Article.createArticle("A3", m1, 18, 20, 100);
		a3.setStock(40);
	}

	/**
	 * Add a few articles to the cart and see whether their price is cumulated
	 * correctly.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testFetchCurrentSum() throws PersistenceException {
		assertEquals(1000, cm.getCartMngr().getMyCart().fetchCurrentSum());
		cm.getCartMngr().addArticle(a2, 5);
		assertEquals(1100, cm.getCartMngr().getMyCart().fetchCurrentSum());
		cm.getCartMngr().addArticle(a3, 22);
		assertEquals(1496, cm.getCartMngr().getMyCart().fetchCurrentSum());
	}

	/**
	 * Add a few articles to the cart and check whether it now contains them.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAddToCart() throws PersistenceException {
		testFetchCurrentSum();
		cm.getCartMngr().addArticle(a1, 20);
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 30));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(expected.size(), cm.getCartMngr().getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getCartMngr().getArticleList().iterator();
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}

	/**
	 * Try adding zero articles to the cart. Since this does not make any sense
	 * an InvalidOrderAmount-Exception is expected.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidOrderAmount
	 */
	@Test(expected = InvalidOrderAmount.class)
	public void testAddToCartInvalidAmount() throws PersistenceException, InvalidOrderAmount {
		pss.addToCart(a1, 0);
	}

	@Test(expected = InvalidOrderAmount.class)
	public void testAddToCartInvalidAmountNegative() throws PersistenceException, InvalidOrderAmount {
		pss.addToCart(a1, -10);
	}

	/**
	 * After executing testAddToCart (to add a few articles to the cart) and
	 * creating a similar Hashmap (with quantified articles) their contents are
	 * tested for same length. Then the article is removed from both and every
	 * single (quantified) article is compared against each other by its amount.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testRemoveFCart() throws PersistenceException {
		testAddToCart();
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 30));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(expected.size(), cm.getCartMngr().getArticleList().getLength());
		PersistentQuantifiedArticles toRemove = cm.getCartMngr().getArticleList()
				.findFirst(new Predcate<PersistentQuantifiedArticles>() {
					@Override
					public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
						return argument.getArticle().equals(a2);
					}
				});
		cm.getCartMngr().removeFCart(toRemove);
		expected.remove(a2);
		assertEquals(expected.size(), cm.getCartMngr().getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getCartMngr().getArticleList().iterator();
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}

	/**
	 * The amount of some articles is changed and their sum is compared to an
	 * expected value.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testChangeAmount() throws PersistenceException {
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getCartMngr().getArticleList().iterator();
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(10, next.getAmount());
		}
		assertEquals(1000, cm.getCartMngr().getMyCart().getCurrentSum());
		PersistentQuantifiedArticles qa1 = cm.getCartMngr().getArticleList()
				.findFirst(new Predcate<PersistentQuantifiedArticles>() {
					@Override
					public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
						return argument.getArticle().equals(a1);
					}
				});
		cm.getCartMngr().getMyCart().changeAmount(qa1, 5);
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(5, next.getAmount());
		}
		assertEquals(500, cm.getCartMngr().getMyCart().getCurrentSum());
	}

	/**
	 * Try to change the amount of an article to zero. This is no valid option
	 * so an InvalidOrderAmount-Exception is expected.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidOrderAmount
	 */
	@Test(expected = InvalidOrderAmount.class)
	public void testChangeAmountZero() throws PersistenceException, InvalidOrderAmount {
		PersistentQuantifiedArticles qa1 = cm.getCartMngr().getArticleList()
				.findFirst(new Predcate<PersistentQuantifiedArticles>() {
					@Override
					public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
						return argument.getArticle().equals(a1);
					}
				});
		CartService.createCartService(pss.getManager()).changeAmount(qa1, 0);
		;
	}

	/**
	 * Try to change the amount of an article below zero. This is no valid option
	 * so an InvalidOrderAmount-Exception is expected. 
	 * 
	 * @throws PersistenceException
	 * @throws InvalidOrderAmount
	 */
	@Test(expected = InvalidOrderAmount.class)
	public void testChangeAmountNegative() throws PersistenceException, InvalidOrderAmount {
		PersistentQuantifiedArticles qa1 = cm.getCartMngr().getArticleList()
				.findFirst(new Predcate<PersistentQuantifiedArticles>() {
					@Override
					public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
						return argument.getArticle().equals(a1);
					}
				});
		CartService.createCartService(pss.getManager()).changeAmount(qa1, -10);
		;
	}

	/**
	 * After checking out an article its cart-state is checked against an instance of the state "CheckedOut".
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testCheckOut() throws PersistenceException, InsufficientStock {
		cm.getCartMngr().checkOut();
		assertEquals(90, a1.getStock());
		assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentCheckedOut);
	}

	@Test
	public void testToOpenCart() throws PersistenceException, InsufficientStock {
		cm.getCartMngr().checkOut();
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getCartMngr().getArticleList().iterator();
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			cm.getCartMngr().changeAmount(next, 10);
			assertEquals(100, a1.getStock());
			assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentOpenCart);
		}
		cm.getCartMngr().checkOut();
		assertEquals(90, a1.getStock());
		cm.getCartMngr().addArticle(a1, 10);
		assertEquals(100, a1.getStock());
		assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentOpenCart);
		cm.getCartMngr().checkOut();
		while (cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			cm.getCartMngr().removeFCart(next);
			assertEquals(100, a1.getStock());
			assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentOpenCart);
		}
	}

	/**
	 * Try to order nothing (null). A FirstCheckOut-Exception is expected.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientFunds 
	 */
	@Test
	public void testOrderException() throws PersistenceException, InsufficientFunds {
		try {
			cm.getCartMngr().order(null);
		} catch (FirstCheckOut e) {
			assertEquals(serverConstants.ErrorMessages.FirstCheckOut, e.getMessage());
		}
	}

}
