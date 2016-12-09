package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAccount.class, TestCart.class, TestShopkeeper.class, TestShopkeeperDataManipulation.class, TestTriggeredShopkeeperActions.class })
public class AllTests {

}
