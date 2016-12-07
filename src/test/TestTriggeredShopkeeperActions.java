package test;

import static org.junit.Assert.*;
import persistence.*;
import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.InsufficientStock;
import model.InvalidStockNumber;
import model.Manufacturer;
import model.ReserveNegative;
import model.ShopkeeperService;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentProductGroup;
import persistence.PersistentShopkeeper;
import persistence.PersistentShopkeeperService;

public class TestTriggeredShopkeeperActions {

	private PersistentShopkeeperService sks;
	private PersistentShopkeeper sk;
	private PersistentProductGroup basicPg;
	private PersistentArticle articleInTest;

	/**
	 * Vor jedem Test werden die Singletons und die Datenbank vorbereitet sowie
	 * die Instanzvariablen gesetzt.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Before
	public void initialize() throws PersistenceException, InvalidStockNumber {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		sks = ShopkeeperService.createShopkeeperService();
		sk = sks.getManager();
		basicPg = sk.getBasicProductGroup();
		articleInTest = Article.createArticle("Bleistift", Manufacturer.createManufacturer("Pelikan"), 100, 10, 100,
				1000);
	}

	/**
	 * Empfangen einer Lieferung. Der Lagerbestand muss entsprechend der
	 * Liefermenge erhöht werden.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testReceiveDelivery() throws PersistenceException {
		articleInTest.receiveDelivery(100);
		assertEquals(100, articleInTest.getStock());
	}

	/**
	 * Packen eines Artikels im OfferedForSale-State mit ausreichendem
	 * Lagerbestand. Lagerbestand muss am Ende dem des Anfangs abzüglich der
	 * Packmenge betragen.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testPackInOfferedFSaleWithEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(100);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		articleInTest.pack(60);
		assertEquals(40, articleInTest.getStock());
	}

	/**
	 * Packen eines Artikels im RemovedFromSale-State mit ausreichendem
	 * Lagerbestand. Lagerbestand muss am Ende dem des Anfangs abzüglich der
	 * Packmenge betragen.
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testPackInRemovedFSaleWithEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(100);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		((OfferedFSaleProxi) articleInTest.getState()).stopSelling();
		articleInTest.pack(60);
		assertEquals(40, articleInTest.getStock());
	}

	/**
	 * Packen eines Artikels im OfferedForSale-State ohne ausreichenden
	 * Lagerbestand. Eine Exception muss geworfen werden und die gewünschte Menge reserviert werden.
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test
	public void testPackInOfferedFSaleWithoutFullStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(50);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		try {
			articleInTest.pack(60);
		} catch (InsufficientStock e) {
		}
		assertEquals(50, articleInTest.getStock());
		assertEquals(60, articleInTest.getReserved());
	}

	/**
	 * Packen eines Artikels im RemovedFromSale-State ohne ausreichenden
	 * Lagerbestand. Eine InsufficientSotck-Exception wird erwartet.
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 */
	@Test(expected = InsufficientStock.class)
	public void testPackInRemovedFSaleWithoutEnaughStock() throws PersistenceException, InsufficientStock {
		articleInTest.receiveDelivery(10);
		((NewlyAddedProxi) articleInTest.getState()).startSelling();
		((OfferedFSaleProxi) articleInTest.getState()).stopSelling();
		articleInTest.pack(60);
	}

	/**
	 * Test der übermäßigen Verringerung des reservierten Lagerbestandes. Eine ReserveNegative-Exception wird erwartet.
	 * @throws PersistenceException
	 * @throws InsufficientStock
	 * @throws ReserveNegative
	 */
	@Test(expected = ReserveNegative.class)
	public void testDeleteReservedOnError() throws PersistenceException, InsufficientStock, ReserveNegative {
		articleInTest.reserve(20);
		articleInTest.deleteReserve(30);
	}
}
