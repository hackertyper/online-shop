package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.DoubleUsername;
import model.Server;
import model.visitor.ServiceVisitor;
import persistence.Cache;
import persistence.PersistenceException;
import persistence.PersistentAccountService;
import persistence.PersistentCartService;
import persistence.PersistentCustomerManager;
import persistence.PersistentCustomerService;
import persistence.PersistentOrderService;
import persistence.PersistentRegisterService;
import persistence.PersistentServer;
import persistence.PersistentShopService;
import persistence.PersistentShopkeeper;
import persistence.PersistentShopkeeperService;

/**
 * Tests functions for configurations by shopkeeper
 */
public class TestShopkeeper {
	
	PersistentServer srvr;
	PersistentShopkeeper keeper;
	PersistentCustomerManager cuMngr;
	
	/**
	 * Prepare database before TestCase starts
	 */
	@BeforeClass
	public static void initialiseFramework(){
		try {
			TestSupport.prepareDatabase();
		} catch (PersistenceException e) {
			throw new Error(e);
		}
	}
	/**
	 * Clear database after TestCase is finished
	 */
	@AfterClass
	public static void clearDataBase(){
		try {
			TestSupport.clearDatabase();
		} catch (PersistenceException e) {
			throw new Error(e);
		}
	}
	/**
	 * Set up environment for TestCase
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		TestSupport.prepareSingletons();
		TestSupport.prepareDatabase();
		Cache.getTheCache().reset$For$Test();
	}

	/**
	 * Handles registration for server
	 * @param server new Server object
	 * @param password password to use for login
	 * @param user user to use for login
	 */
	public void register(PersistentServer server, String password, String user) {
		try {
			server = Server.createServer(password, user, 0, new java.sql.Timestamp(0));
			server.getService().accept(new ServiceVisitor() {
				@Override
				public void handleShopService(PersistentShopService shopService) throws PersistenceException {}
				@Override
				public void handleOrderService(PersistentOrderService orderService) throws PersistenceException {}
				@Override
				public void handleCartService(PersistentCartService cartService) throws PersistenceException {}
				@Override
				public void handleAccountService(PersistentAccountService accountService) throws PersistenceException {}
				@Override
				public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException {
					keeper = shopkeeperService.getManager();
				}
				@Override
				public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException {
					try {
						registerService.register("Marko", "Polo");
						PersistentServer newServer = null;
						register(newServer, "Polo", "Marko");
					} catch (DoubleUsername e) {
						fail();
					}
				}
				@Override
				public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException {
					cuMngr = customerService.getManager();
				}
			});
		} catch (PersistenceException e) {
			fail();
		}
	}
	
	/**
	 * Tests the configuration methods for customerDeliveries
	 */
	@Test
	public void testDeliveryConfigs() {
		try {
			register(srvr, common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
			if(keeper == null) fail();
			assertEquals(0, keeper.getStandardDelivery().getExtraCharge());
			assertEquals(10, keeper.getOnDelivery().getExtraCharge());
			assertEquals(50000, keeper.getStandardDelivery().getTime());
			assertEquals(10000, keeper.getOnDelivery().getTime());
			keeper.changeCharge(keeper.getStandardDelivery(), 10);
			keeper.changeCharge(keeper.getOnDelivery(), 20);
			keeper.changeTime(keeper.getStandardDelivery(), 100);
			keeper.changeTime(keeper.getOnDelivery(), 200);
			assertEquals(10, keeper.getStandardDelivery().getExtraCharge());
			assertEquals(20, keeper.getOnDelivery().getExtraCharge());
			assertEquals(100, keeper.getStandardDelivery().getTime());
			assertEquals(200, keeper.getOnDelivery().getTime());
		} catch (PersistenceException e) {
			fail();
		}	
	}
	
	/**
	 * Tests the configuration methods for accounts
	 */
	@Test
	public void testAccountConfig() {
		try {
			register(srvr, "", common.RPCConstantsAndServices.Public);
			if(cuMngr == null) fail();
			assertEquals(1000, serverConstants.ConfigConstants.getPresetAccountBalance());
			assertEquals(0, serverConstants.ConfigConstants.getPresetAccountLowerLimit());
			assertEquals(1000, cuMngr.getAccMngr().getMyAccount().getBalance());
			assertEquals(0, cuMngr.getAccMngr().getMyAccount().getLowerLimit());
			PersistentServer srvr2 = null;
			register(srvr2, common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
			keeper.presetBalance(2000);
			keeper.presetLowerLimit(100);
			assertEquals(2000, serverConstants.ConfigConstants.getPresetAccountBalance());
			assertEquals(100, serverConstants.ConfigConstants.getPresetAccountLowerLimit());
			assertEquals(1000, cuMngr.getAccMngr().getMyAccount().getBalance());
			assertEquals(0, cuMngr.getAccMngr().getMyAccount().getLowerLimit());
		} catch (PersistenceException e) {
			fail();
		}	
	}
	
	/**
	 * Tests the configuration methods for retoure
	 */
	@Test
	public void testRetoureConfig() {
		try {
			register(srvr, common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
			if(keeper == null) fail();
			assertEquals(10, serverConstants.ConfigConstants.getRetourePercentage());
			keeper.changeRetourePercentage(20);
			assertEquals(20, serverConstants.ConfigConstants.getRetourePercentage());
		} catch (PersistenceException e) {
			fail();
		}	
	}

}
