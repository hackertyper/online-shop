package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.CustomerManager;
import model.CustomerService;
import model.FirstCheckOut;
import model.InsufficientFunds;
import model.InsufficientStock;
import model.Manufacturer;
import model.TestDelivery;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentCustomerManager;
import persistence.PersistentCustomerOrder;
import persistence.PersistentCustomerService;
import persistence.PersistentManufacturer;
import persistence.PersistentOpenCart;

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
		cm.getCartMngr().order(TestDelivery.getTheTestDelivery());
		assertEquals(600, cm.getAccMngr().getMyAccount().getBalance());
		assertTrue(cm.getCartMngr().getMyCart().getState() instanceof PersistentOpenCart);
		assertEquals(0, cm.getCartMngr().getArticleList().getLength());
	}
}
