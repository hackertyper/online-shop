package test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.time.Instant;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.CustomerManager;
import model.CustomerOrder;
import model.CustomerService;
import model.FirstCheckOut;
import model.InsufficientFunds;
import model.InsufficientStock;
import model.Manufacturer;
import model.QuantifiedArticles;
import model.Retoure;
import persistence.PersistenceException;
import persistence.PersistentArrivedOrder;
import persistence.PersistentArticle;
import persistence.PersistentCustomerManager;
import persistence.PersistentCustomerOrder;
import persistence.PersistentCustomerService;
import persistence.PersistentManufacturer;
import persistence.PersistentOpenCart;
import persistence.PersistentRetoure;
import persistence.PersistentSendOrder;

public class TestOrder {
	PersistentCustomerService cs;
	PersistentCustomerManager cm;
	PersistentCustomerOrder co;
	PersistentArticle a1;
	PersistentArticle a2;
	PersistentManufacturer m1;
	
	@Before
	public void setUp() throws Exception {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		cm = CustomerManager.createCustomerManager();
		cs = CustomerService.createCustomerService(cm);
		m1 = Manufacturer.createManufacturer("M1");
		a1 = Article.createArticle("A1", m1, 100, 10, 150, 0);
		a1.setStock(100);
		cm.getCartMngr().addArticle(a1, 2);
		a2 = Article.createArticle("A2", m1, 20, 5, 60, 0);
		a2.setStock(30);
		cm.getCartMngr().addArticle(a2, 10);
	}
	
	@Test
	public void testOrder() throws PersistenceException, InsufficientStock, FirstCheckOut, InsufficientFunds {
		cm.getCartMngr().checkOut();
		cm.getCartMngr().order();
		assertEquals(600, cm.getAccMngr().getMyAccount().getBalance());
		assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentOpenCart);
		assertEquals(0, cm.getCartMngr().getArticleList().getLength());
	}
	
	@Test
	public void testOrderSend() throws PersistenceException {
		co = CustomerOrder.createCustomerOrder(0, Timestamp.from(Instant.now()));
		assertTrue(co.getMyState() instanceof PersistentSendOrder);
		cm.getOrderMngr().addOrder(co);
		assertEquals(0, cm.getOrderMngr().getOrders().getLength());
		co.send();
		assertTrue(co.getMyState() instanceof PersistentArrivedOrder);
		assertEquals(1, cm.getOrderMngr().getOrders().getLength());
	}
	
	@Test
	public void testOrderAcceptDelivery() throws PersistenceException {
		co = CustomerOrder.createCustomerOrder(0, Timestamp.from(Instant.now()));
		co.getArticleList().add(QuantifiedArticles.createQuantifiedArticles(a1, 1));
		cm.getOrderMngr().addOrder(co);
		co.send();
		assertEquals(1, cm.getOrderMngr().getOrders().getLength());
		cm.getOrderMngr().acceptDelivery(co);
		assertEquals(0, cm.getOrderMngr().getOrders().getLength());
	}
	
	@Test
	public void testOrderRetoure() throws PersistenceException {
		PersistentRetoure re = Retoure.createRetoure(0, Timestamp.from(Instant.now()));
		re.getArticleList().add(QuantifiedArticles.createQuantifiedArticles(a1, 10));
		re.send();
		assertEquals(110, a1.getStock());
	}
	
	@Test
	public void testOrderRetoureDelivery() throws PersistenceException {
		co = CustomerOrder.createCustomerOrder(0, Timestamp.from(Instant.now()));
		co.getArticleList().add(QuantifiedArticles.createQuantifiedArticles(a1, 10));
		cm.getOrderMngr().addOrder(co);
		co.send();
		assertEquals(1, cm.getOrderMngr().getOrders().getLength());
		cm.getOrderMngr().retoureDelivery(co, co.getArticleList().getList());
		assertEquals(110, a1.getStock());
		assertEquals(0, cm.getOrderMngr().getOrders().getLength());
	}

}
