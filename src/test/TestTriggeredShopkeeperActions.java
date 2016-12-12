package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import persistence.*;
import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.InsufficientStock;
import model.InvalidStockNumber;
import model.Manufacturer;
import model.ShopkeeperService;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentProductGroup;
import persistence.PersistentShopkeeper;
import persistence.PersistentShopkeeperService;

/**
 * Test of all actions which the shopkeeper cannot execute themselves but which
 * can be triggered by e.g. customers.
 * 
 * @author admin
 *
 */
public class TestTriggeredShopkeeperActions {

	private PersistentShopkeeperService sks;
	private PersistentShopkeeper sk;
	private PersistentProductGroup basicPg;
	private PersistentArticle articleInTest;

	/**
	 * Prior to every single test singletons, database and fields have to be
	 * prepared again.
	 * 
	 * Additionally an article is created to perform tests on.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Before
	public void initialize() throws PersistenceException, InvalidStockNumber {
		TestSupport.prepareSingletons();
		try {
			TestSupport.prepareDatabase();
		} catch (SQLException | IOException e) {
			fail();
		}
		sks = ShopkeeperService.createShopkeeperService();
		sk = sks.getManager();
		basicPg = sk.getBasicProductGroup();
		articleInTest = Article.createArticle("Bleistift", Manufacturer.createManufacturer("Pelikan", 1000), 100, 10,
				100);
	}

	/**
	 * Check whether stock number is equal the delivery amount (after the
	 * delivery has been performed of course).
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testReceiveDelivery() throws PersistenceException {
		articleInTest.receiveDelivery(100);
		assertEquals(100, articleInTest.getStock());
	}

	/**
	 * Packing of an article being offered for sale with sufficient stock.
	 * Article stock number must be lower than before.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testPackInOfferedFSaleWithEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(100);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		articleInTest.reserve(60);
		assertEquals(40, articleInTest.getStock());
	}

	/**
	 * Packing of an article being removed from sale with sufficient stock.
	 * Article stock number must be lower than before.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testPackInRemovedFSaleWithEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(100);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		((OfferedFSaleProxi) articleInTest.getState()).stopSelling();
		articleInTest.reserve(60);
		assertEquals(40, articleInTest.getStock());
	}

	/**
	 * Packen eines Artikels im RemovedFromSale-State ohne ausreichenden
	 * Lagerbestand. Eine InsufficientSotck-Exception wird erwartet.
	 * 
	 * Packing of an article being removed from sale with insufficient stock.
	 * Since this is impossible an InsufficientStock-Exception is expected.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test(expected = InsufficientStock.class)
	public void testPackInRemovedFSaleWithoutEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(10);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		((OfferedFSaleProxi) articleInTest.getState()).stopSelling();
		articleInTest.reserve(60);
	}
}
