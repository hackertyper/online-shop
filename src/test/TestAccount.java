package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.Account;
import model.InsufficientFunds;
import persistence.PersistenceException;
import persistence.PersistentAccount;

/**
 * Test of customer accounts.
 *
 */
public class TestAccount {
	PersistentAccount acc;

	/**
	 * Set up all data including an account under test.
	 * @throws PersistenceException 
	 */
	@Before
	public void setUp() throws PersistenceException {
		TestSupport.prepareSingletons();
		try {
			TestSupport.prepareDatabase();
		} catch (PersistenceException | SQLException | IOException e) {
			fail();
		}
		acc = Account.createAccount();
	}

	/**
	 * After the account is created in setUp() its presets are tested.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountCreation() throws PersistenceException {
		assertEquals(1000, acc.getBalance());
		assertEquals(0, acc.getLowerLimit());
	}

	/**
	 * Test whether depositing funds is working correctly.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountDeposit() throws PersistenceException {
		acc.setBalance(1000);
		acc.deposit(500);
		assertEquals(1500, acc.getBalance());
	}

	/**
	 * Test whether withdrawing funds is working correctly.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientFunds
	 */
	@Test
	public void testAccountWithdraw() throws PersistenceException, InsufficientFunds {
		acc.setBalance(1000);
		acc.withdraw(500);
		assertEquals(500, acc.getBalance());
	}

	/**
	 * Test whether withdrawing more funds from the account than lowerlimit
	 * would allow is producing an InsufficientFunds-Exception.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountWithdrawErrorBalanceLessAmount() throws PersistenceException {
		acc.setBalance(1000);
		try {
			acc.withdraw(1500);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
		}
	}

	/**
	 * Test whether withdrawing more funds from the account than lowerlimit
	 * would allow is producing an InsufficientFunds-Exception. This time
	 * lowerLimit is set a higher value before.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountWithdrawErrorBalanceLessLowerLimit() throws PersistenceException {
		acc.setBalance(1000);
		acc.setLowerLimit(100);
		try {
			acc.withdraw(950);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
		}
	}

	/**
	 * Test whether paying through an account removes the expected amount.
	 * 
	 * @throws PersistenceException
	 * @throws InsufficientFunds
	 */
	@Test
	public void testAccountPay() throws PersistenceException, InsufficientFunds {
		acc.setBalance(1000);
		acc.pay(500);
		assertEquals(500, acc.getBalance());
	}

	/**
	 * Try paying more than lowerLimit would allow. An InsufficientFunds
	 * exception should occur and account-balance should remain like before.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountPayErrorBalanceLessAmount() throws PersistenceException {
		acc.setBalance(1000);
		try {
			acc.pay(1500);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
			assertEquals(1000, acc.getBalance());
		}
	}

	/**
	 * Try paying more than lowerLimit (now set to 100) would allow. An InsufficientFunds
	 * exception should occur and account-balance should remain like before.
	 * 
	 * @throws PersistenceException
	 */
	@Test
	public void testAccountPayErrorBalanceLessLowerLimit() throws PersistenceException {
		acc.setBalance(1000);
		acc.setLowerLimit(100);
		try {
			acc.pay(950);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
			assertEquals(1000, acc.getBalance());
		}
	}

}
