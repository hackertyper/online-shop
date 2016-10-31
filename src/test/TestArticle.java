package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Article;
import model.Manufacturer;
import model.NewlyAdded;
import persistence.PersistenceException;
import persistence.PersistentArticle;
import persistence.PersistentManufacturer;
import persistence.PersistentNewlyAdded;

public class TestArticle {
	PersistentManufacturer m1;
	PersistentArticle a1;
	
	@Before
	public void setUp() throws Exception {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		m1 = Manufacturer.createManufacturer("M1");
	}

	@Test
	public void testArticleStateAfterCreation() {
		try {
			a1 = Article.createArticle("a1", m1, 100, 10, 150, 0);
			PersistentNewlyAdded expected = NewlyAdded.createNewlyAdded();
			assertTrue(a1.getState() instanceof PersistentNewlyAdded);
		} catch (PersistenceException e) {
			throw new Error(e);
		}
	}
	
	@Test
	public void testArticleStartSelling() {
		testArticleStateAfterCreation();
		try {
			if(a1.getState() instanceof PersistentNewlyAdded) {
				
			}
			PersistentNewlyAdded expected = NewlyAdded.createNewlyAdded();
			assertTrue(a1.getState() instanceof PersistentNewlyAdded);
		} catch (PersistenceException e) {
			throw new Error(e);
		}
	}

}
