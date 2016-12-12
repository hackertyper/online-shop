package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

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

/**
 * This class is intended for testing all actions the shopkeeper might want to
 * perform like editing articles and product groups.
 *
 */
public class TestShopkeeperDataManipulation {

	private PersistentShopkeeperService sks;
	private PersistentShopkeeper sk;
	private PersistentProductGroup basicPg;

	/**
	 * Prior to every single test singletons, database and fields have to be
	 * prepared again.
	 * 
	 * @throws PersistenceException
	 */
	@Before
	public void initialize() throws PersistenceException {
		TestSupport.prepareSingletons();
		try {
			TestSupport.prepareDatabase();
		} catch (SQLException | IOException e) {
			fail();
		}
		sks = ShopkeeperService.createShopkeeperService();
		sk = sks.getManager();
		basicPg = sk.getBasicProductGroup();
	}

	/**
	 * Check the essentials of shopkeeper after program start; that means there
	 * has to be one basicProductGroup which contains one article.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testBasicSetup() throws PersistenceException {
		assertEquals(1, basicPg.cumulateArticleCount());
	}

	/**
	 * An article is created and added to basicProductGroup.
	 * 
	 * Three scenarios are tested:
	 * 
	 * Fist test is wether the state of the new article is NewlyAdded
	 * 
	 * Second the article will be offered for sale and the correct state
	 * OfferedFSale is tested.
	 * 
	 * Finally the article is removed from sale and its state is tested again.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 * @throws InterruptedException
	 */
	@Test
	public void testArticleStates() throws PersistenceException, InvalidStockNumber, InterruptedException {
		PersistentArticle article = Article.createArticle("", Manufacturer.createManufacturer("", 0), 0, 0, 0);
		basicPg.addItem(article);

		assertEquals(NewlyAdded.createNewlyAdded().getClass(), article.getState().getClass());
		sks.startSelling((NewlyAddedProxi) article.getState());
		assertEquals(OfferedFSale.createOfferedFSale().getClass(), article.getState().getClass());
		sks.stopSelling((OfferedFSaleProxi) article.getState());
		assertEquals(RemovedFSale.createRemovedFSale().getClass(), article.getState().getClass());
	}

	/**
	 * Add an article called "Bleistift" to basicProductGroup and test, whether
	 * basicProductGroup contains an article which has the exact same
	 * description.
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
	 * An article is created whose minimum stock number is above the maximum.
	 * Since this is an invalid option an InvalidStockNumber-Exception is
	 * expected.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testArticleCreationWithInvalidStock() throws PersistenceException, InvalidStockNumber {
		sks.createArticle(basicPg, "", "", 0, 0, 10, 0);
	}

	/**
	 * Test changing maximum stock number
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testChangeMaxStock() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer("", 10), 0, 10, 10);
		basicPg.addItem(a);
		sks.changeMaxStock(a, 15);
		assertEquals(15, a.getMaxStock());
	}

	/**
	 * Test changing minimum stock number
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testChangeMinStock() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer("", 10), 0, 10, 10);
		basicPg.addItem(a);
		sks.changeMinStock(a, 5);
		assertEquals(5, a.getMinStock());
	}

	/**
	 * Changing the maximum stock below minimum has to cause an exception.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testChangeMaxStockInvalid() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer("", 10), 0, 10, 10);
		basicPg.addItem(a);
		sks.changeMaxStock(a, 5);
	}

	/**
	 * Changing the minimum stock above maximum has to cause an exception.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test(expected = InvalidStockNumber.class)
	public void testChangeMinStockInvalid() throws PersistenceException, InvalidStockNumber {
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer("", 10), 0, 10, 10);
		basicPg.addItem(a);
		sks.changeMinStock(a, 15);
	}

	/**
	 * Anlage einer Produktgruppe.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testAddSubPg() throws PersistenceException, InvalidStockNumber {
		sks.createProductGroup(basicPg, "Subgroup");
		assertEquals(3, basicPg.cumulateArticleCount());
		assertEquals(4, basicPg.getItemList().getLength());
	}

	/**
	 * Creation of an article as well as a product group wich contains an
	 * article.
	 * 
	 * In this test the number of articles in basicProductGroup has to be 2.
	 * 
	 * @throws PersistenceException
	 * @throws InvalidStockNumber
	 */
	@Test
	public void testAddSubPgAndArticle() throws PersistenceException, InvalidStockNumber {
		sks.createArticle(basicPg, "", "", 0, 0, 0, 0);
		PersistentProductGroup subPg = ProductGroup.createProductGroup("Subgroup");
		basicPg.addItem(subPg);
		sks.createArticle(subPg, "", "", 0, 10, 0, 10);
		assertEquals(6, basicPg.cumulateArticleCount());
	}

	/**
	 * Test of changing the product group of an article.
	 * 
	 * @throws InvalidStockNumber
	 * @throws PersistenceException
	 */
	@Test
	public void testChangeProductGroup() throws InvalidStockNumber, PersistenceException {
		// Artikel erstellen und einbinden
		PersistentArticle a = Article.createArticle("", Manufacturer.createManufacturer("", 10), 0, 10, 10);
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
		// Test, ob sich der Artikel nicht mehr in der basicProductGroup
		// befindet
		assertEquals(null, basicPg.getItemList().findFirst(new Predcate<PersistentItem>() {

			@Override
			public boolean test(PersistentItem argument) throws PersistenceException {
				return argument.equals(a);
			}
		}));
	}
}
