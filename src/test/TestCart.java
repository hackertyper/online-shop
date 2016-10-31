package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.CartManager;
import model.InsufficientStock;
import model.Manufacturer;
import model.OpenCart;
import model.QuantifiedArticles;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentCartManager;
import persistence.PersistentCheckedOut;
import persistence.PersistentManufacturer;
import persistence.PersistentOpenCart;
import persistence.PersistentQuantifiedArticles;
import persistence.Predcate;

public class TestCart {
	PersistentCartManager cm;
	PersistentArticle a1;
	PersistentArticle a2;
	PersistentArticle a3;
	PersistentManufacturer m1;
	
	@Before
	public void setUp() throws Exception {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		cm = CartManager.createCartManager();
		m1 = Manufacturer.createManufacturer("M1");
		a1 = Article.createArticle("a1", m1, 100, 10, 150, 0);
		a1.setStock(100);
		a1.addToCart(10, cm.getMyCart());
		a2 = Article.createArticle("a2", m1, 20, 5, 60, 0);
		a2.setStock(34);
		a3 = Article.createArticle("a3", m1, 18, 20, 100, 0);
		a3.setStock(40);
	}

	@Test
	public void testCurrentSum() throws PersistenceException {
		assertEquals(1000, cm.getMyCart().getCurrentSum());
		a2.addToCart(5, cm.getMyCart());
		assertEquals(1100, cm.getMyCart().getCurrentSum());
		a3.addToCart(22, cm.getMyCart());
		assertEquals(1496, cm.getMyCart().getCurrentSum());
	}
	
	@Test
	public void testAddToCart() throws PersistenceException {
		testCurrentSum();
		a1.addToCart(20, cm.getMyCart());
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 30));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(expected.size(), cm.getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}
	
	@Test
	public void testRemoveFCart() throws PersistenceException {
		testAddToCart();
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 30));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(expected.size(), cm.getArticleList().getLength());
		PersistentQuantifiedArticles toRemove = cm.getArticleList().findFirst(new Predcate<PersistentQuantifiedArticles>() {
			@Override
			public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
				return argument.getArticle().equals(a2);
			}
		});
		cm.removeFCart(toRemove);
		expected.remove(a2);
		assertEquals(expected.size(), cm.getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}
	
	@Test
	public void testChangeAmount() throws PersistenceException {
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(10, next.getAmount());
		}
		assertEquals(1000, cm.getMyCart().getCurrentSum());
		PersistentQuantifiedArticles qa1 = cm.getArticleList().findFirst(new Predcate<PersistentQuantifiedArticles>() {
			@Override
			public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
				return argument.getArticle().equals(a1);
			}
		});
		cm.getMyCart().changeAmount(qa1, 5);
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(5, next.getAmount());
		}
		assertEquals(500, cm.getMyCart().getCurrentSum());
	}
	
	@Test
	public void testCheckOut() throws PersistenceException, InsufficientStock {
		cm.checkOut();
		assertEquals(90, a1.getStock());
		assertTrue(cm.getMyCart().getState() instanceof PersistentCheckedOut);
	}
	
	@Test
	public void testCheckOutException() throws PersistenceException {
		a1.addToCart(100, cm.getMyCart());
		try {	
			cm.checkOut();
		} catch (InsufficientStock e) {
			assertEquals(100, a1.getStock());
			assertTrue(cm.getMyCart().getState() instanceof PersistentOpenCart);
			assertEquals(serverConstants.ErrorMessages.InsufficientStock, e.getMessage());
		}
	}
	
	@Test
	public void testToOpenCart() throws PersistenceException, InsufficientStock {
		cm.checkOut();
		Iterator<PersistentQuantifiedArticles> cartIterator = cm.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			cm.changeAmount(next, 10);
			assertEquals(100, a1.getStock());
			assertTrue(cm.getMyCart().getState() instanceof PersistentOpenCart);
		}
		cm.checkOut();
		a1.addToCart(10, cm.getMyCart());
		assertEquals(100, a1.getStock());
		assertTrue(cm.getMyCart().getState() instanceof PersistentOpenCart);
		cm.checkOut();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			cm.removeFCart(next);
			assertEquals(100, a1.getStock());
			assertTrue(cm.getMyCart().getState() instanceof PersistentOpenCart);
		}
	}

}
