package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.Cart;
import model.InsufficientStock;
import model.Manufacturer;
import model.QuantifiedArticles;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentCart;
import persistence.PersistentManufacturer;
import persistence.PersistentQuantifiedArticles;

public class TestCart {
	PersistentCart cart;
	PersistentArticle a1;
	PersistentArticle a2;
	PersistentArticle a3;
	PersistentManufacturer m1;
	
	@Before
	public void setUp() throws Exception {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		cart = Cart.createCart();
		m1 = Manufacturer.createManufacturer("M1");
		a1 = Article.createArticle(m1, 100, 10, 150, 0);
		a1.setStock(100);
		a2 = Article.createArticle(m1, 20, 5, 60, 0);
		a2.setStock(34);
		a3 = Article.createArticle(m1, 18, 20, 100, 0);
		a3.setStock(42);
	}
	
	@Test
	public void testAddToCart() throws PersistenceException, InsufficientStock {
		a1.addToCart(10, cart);
		assertEquals(1000, cart.getCurrentSum());
		a2.addToCart(5, cart);
		assertEquals(1100, cart.getCurrentSum());
		a3.addToCart(22, cart);
		assertEquals(1496, cart.getCurrentSum());
		a1.addToCart(20, cart);
		assertEquals(3496, cart.getCurrentSum());
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 30));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(expected.size(), cart.getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cart.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}
	
	@Test
	public void testRemoveFCart() throws PersistenceException, InsufficientStock {
		a1.addToCart(10, cart);
		a2.addToCart(5, cart);
		a3.addToCart(22, cart);
		Map<PersistentArticle, PersistentQuantifiedArticles> expected = new HashMap<PersistentArticle, PersistentQuantifiedArticles>();
		expected.put(a1, QuantifiedArticles.createQuantifiedArticles(a1, 10));
		expected.put(a2, QuantifiedArticles.createQuantifiedArticles(a2, 5));
		expected.put(a3, QuantifiedArticles.createQuantifiedArticles(a3, 22));
		assertEquals(1496, cart.getCurrentSum());
		assertEquals(expected.size(), cart.getArticleList().getLength());
		cart.removeArticle(QuantifiedArticles.createQuantifiedArticles(a3, 22));
		expected.remove(a3);
		assertEquals(1100, cart.getCurrentSum());
		assertEquals(expected.size(), cart.getArticleList().getLength());
		Iterator<PersistentQuantifiedArticles> cartIterator = cart.getArticleList().iterator();
		while(cartIterator.hasNext()) {
			PersistentQuantifiedArticles next = cartIterator.next();
			assertEquals(expected.get(next.getArticle()).getAmount(), next.getAmount());
		}
	}
	
	@Test
	public void testAddToCartStockLessAmount() throws PersistenceException {
		try {
			a1.addToCart(100, cart);
		} catch (InsufficientStock e) {
			assertEquals("", e.getMessage());
		}
		
	}
}