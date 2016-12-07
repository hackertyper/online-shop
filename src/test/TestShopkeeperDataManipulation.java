package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.InvalidStockNumber;
import model.Manufacturer;
import model.NewlyAdded;
import model.OfferedFSale;
import model.ProductGroup;
import model.RemovedFSale;
import model.ShopkeeperService;
import persistence.NewlyAddedProxi;
import persistence.OfferedFSaleProxi;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentItem;
import persistence.PersistentProductGroup;
import persistence.PersistentShopkeeper;
import persistence.PersistentShopkeeperService;
import persistence.Predcate;

public class TestShopkeeperDataManipulation {

	private PersistentShopkeeperService sks;
	private PersistentShopkeeper sk;
	private PersistentProductGroup basicPg;

	/**
	 * Vor jedem Test werden die Singletons und die Datenbank vorbereitet sowie
	 * die Instanzvariablen gesetzt.
	 * 
	 * @throws PersistenceException
	 */
	@Before
	public void initialize() throws PersistenceException {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		sks = ShopkeeperService.createShopkeeperService();
		sk = sks.getManager();
		basicPg = sk.getBasicProductGroup();
	}

	/**
	 * Prüfen der essentiellen Teile des Lagers nach Programmstart.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testBasicSetup() throws PersistenceException {
		assertEquals(0, basicPg.cumulateArticleCount());
	}

	/**
	 * Erstellung eines Artikels und Hinzufügen zur basicProductGroup.
	 * 
	 * Es erfolgen drei Tests:
	 * 
	 * Zuerst wird geprüft, ob der State des neuen Artikels NewlyAdded ist.
	 * 
	 * Dann wird er durch startSelling(...) in den Verkauf genommen und es wird
	 * getestet, ob er jetzt den State OfferedFSale besitzt.
	 * 
	 * Nun wird er durch stopSelling aus dem Verkauf genommen und der Arikel
	 * wird auf den Status RemovedFSale getestet.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 * @throws InterruptedException
	 */
	@Test
	public void testArticleStates() throws PersistenceException, InvalidStockNumber, InterruptedException {
		PersistentArticle article = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 0, 0, 0);
		basicPg.addItem(article);

		assertEquals(NewlyAdded.createNewlyAdded().getClass(), article.getState().getClass());
		sks.startSelling((NewlyAddedProxi) article.getState());
		assertEquals(OfferedFSale.createOfferedFSale().getClass(), article.getState().getClass());
		sks.stopSelling((OfferedFSaleProxi) article.getState());
		assertEquals(RemovedFSale.createRemovedFSale().getClass(), article.getState().getClass());
	}

	/**
	 * Hinzufügen eines Artikels namens "Bleistift" zur basicProductGroup
	 * 
	 * Test, ob der Artikel dort enthalten ist und die gewünschte Beschreibung
	 * besitzt.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testAddArticle() throws PersistenceException, InvalidStockNumber {
		sks.createArticle(basicPg, "Bleistift", "", 0, 0, 0, 0);
		assertEquals("Bleistift", basicPg.getItemList().findFirst(new Predcate<PersistentItem>() {

			@Override
			public boolean test(PersistentItem argument) throws PersistenceException {
				return argument.getDescription() == "Bleistift";
			}
		}).getDescription());

	}

	/**
	 * Anlage eines Artikels, dessen minimaler Lagerbestand den maximalen
	 * übersteigt. So ein Fall darf nicht vorkommen, deswegen wird eine
	 * Exception geworfen.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testArticleCreationWithInvalidStock() throws PersistenceException, InvalidStockNumber {
		sks.createArticle(basicPg, "", "", 0, 0, 10, 0);
	}

	/**
	 * Test der Änderung des maximalen Lagerbestandes.
	 * 
	 * Dieser darf nicht kleiner als der Minimale sein.
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testChangeMaxStock() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 10, 10, 10);
		basicPg.addItem(a);
		sks.changeMaxStock(a, 15);
		assertEquals(15, a.getMaxStock());
	}

	/**
	 * Test der Änderung des minimalen Lagerbestandes.
	 * 
	 * Dieser darf nicht größer als der Maximale sein.
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testChangeMinStock() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 10, 10, 10);
		basicPg.addItem(a);
		sks.changeMinStock(a, 5);
		assertEquals(5, a.getMinStock());
	}

	/**
	 * Test der Änderung des maximalen Lagerbestandes bei ungültiger Eingabe.
	 * 
	 * Dieser darf nicht kleiner als der Minimale sein.
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testChangeMaxStockInvalid() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 10, 10, 10);
		basicPg.addItem(a);
		sks.changeMaxStock(a, 5);
	}

	/**
	 * Test der Änderung des minimalen Lagerbestandes bei ungültiger Eingabe.
	 * 
	 * Dieser darf nicht größer als der Maximale sein.
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testChangeMinStockInvalid() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 10, 10, 10);
		basicPg.addItem(a);
		sks.changeMinStock(a, 15);
	}

	/**
	 * Anlage einer Produktgruppe.
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testAddSubPg() throws PersistenceException, InvalidStockNumber {
		sks.createProductGroup(basicPg, "Subgroup");
		assertEquals(0, basicPg.cumulateArticleCount());
		assertEquals(1, basicPg.getItemList().getLength());
	}

	/**
	 * Anlage eines Artikels sowie einer Produktgruppe und darin eines Artikels.
	 * 
	 * Zum Test wird die Gesamtartikelanzahl der basicProductGroup abgefragt (die 2 sein muss)
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testAddSubPgAndArticle() throws PersistenceException, InvalidStockNumber {
		sks.createArticle(basicPg, "", "", 0, 0, 0, 0);
		PersistentProductGroup subPg = ProductGroup.createProductGroup("Subgroup");
		basicPg.addItem(subPg);
		sks.createArticle(subPg, "", "", 0, 10, 0, 10);
		assertEquals(2, basicPg.cumulateArticleCount());
	}
	
	/**
	 * 
	 * @throws InvalidStockNumber
	 * @throws PersistenceException
	 */
	@Test
	public void testChangeProductGroup() throws InvalidStockNumber, PersistenceException {
		// Artikel erstellen und einbinden
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer(""), 0, 10, 10, 10);
		basicPg.addItem(a);
		// Produktgruppe erstellen und Artikel verschieben
		PersistentProductGroup subGroup = ProductGroup.createProductGroup("Subgroup");
		sks.changeProductGroup(a, subGroup);
		// Test, ob sich der Artikel a in der subGroup befindet
		assertEquals(a, subGroup.getItemList().findFirst(new Predcate<PersistentItem>() {

			@Override
			public boolean test(PersistentItem argument) throws PersistenceException {
				return argument.equals(a);
			}
		}));
		// Test, ob sich der Artikel nicht mehr in der basicProductGroup befindet
		assertEquals(null, basicPg.getItemList().findFirst(new Predcate<PersistentItem>() {

			@Override
			public boolean test(PersistentItem argument) throws PersistenceException {
				return argument.equals(a);
			}
		}));
	}
}
