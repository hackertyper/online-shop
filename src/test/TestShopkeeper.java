package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.DuplicateUsername;
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
	
	PersistentShopkeeper keeper;
	PersistentCustomerManager cuMngr;
	
	/**
	 * Prepare database before TestCase starts
	 */
	@BeforeClass
	public static void initialiseFramework(){
		try {
			TestSupport.prepareDatabase();
		} catch (PersistenceException | SQLException | IOException e) {
			fail();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	 * @param password password to use for login
	 * @param user user to use for login
	 */
	public void register(String password, String user) {
		try {
			PersistentServer srvr = Server.createServer(password, user, 0, new java.sql.Timestamp(0));
			handleService(srvr);
		} catch (PersistenceException e) {
			fail();
		}
	}
	
	private void handleService(PersistentServer server) {
		try {
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
						PersistentServer newServer = Server.createServer("Polo", "Marko", 0, new java.sql.Timestamp(0));
						handleService(newServer);
					} catch (DuplicateUsername e) {
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
			register(common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
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
			register("", common.RPCConstantsAndServices.Public);
			if(cuMngr == null) fail();
			assertEquals(1000, serverConstants.ConfigConstants.getPresetAccountBalance());
			assertEquals(0, serverConstants.ConfigConstants.getPresetAccountLowerLimit());
			assertEquals(1000, cuMngr.getAccMngr().getMyAccount().getBalance());
			assertEquals(0, cuMngr.getAccMngr().getMyAccount().getLowerLimit());
			register(common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
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
			register(common.RPCConstantsAndServices.AdministratorName, common.RPCConstantsAndServices.AdministratorName);
			if(keeper == null) fail();
			assertEquals(10, serverConstants.ConfigConstants.getRetourePercentage());
			keeper.changeRetourePercentage(20);
			assertEquals(20, serverConstants.ConfigConstants.getRetourePercentage());
		} catch (PersistenceException e) {
			fail();
		}	
	}

}
