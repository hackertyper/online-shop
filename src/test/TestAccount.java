package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Account;
import model.InsufficientFunds;
import persistence.PersistenceException;
import persistence.PersistentAccount;

public class TestAccount {
	PersistentAccount acc;
	
	@Before
	public void setUp() throws Exception {
			TestSupport.prepareSingletons();
			TestSupport.prepareDatabase();
			acc = Account.createAccount();
	}

	public void testAccountCreation() throws PersistenceException {
		assertEquals(1000, acc.getBalance());
		assertEquals(100, acc.getLowerLimit());
	}
	
	@Test
	public void testAccountDeposit() throws PersistenceException {
		acc.setBalance(1000);
		acc.deposit(500);
		assertEquals(1500, acc.getBalance());
	}
	
	@Test
	public void testAccountWithdraw() throws PersistenceException, InsufficientFunds {
		acc.setBalance(1000);
		acc.withdraw(500);
		assertEquals(500, acc.getBalance());
	}	
	
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
	
	@Test
	public void testAccountWithdrawErrorBalanceLessLowerLimit() throws PersistenceException {
		acc.setBalance(1000);
		try {
			acc.withdraw(1050);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
		}
	}
	
	@Test
	public void testAccountPay() throws PersistenceException, InsufficientFunds {
		acc.setBalance(1000);
		acc.pay(500);
		assertEquals(500, acc.getBalance());
	}
	
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
	
	@Test
	public void testAccountPayErrorBalanceLessLowerLimit() throws PersistenceException {
		acc.setBalance(1000);
		try {
			acc.pay(1050);
			fail("No expected InsufficientFunds exception occured");
		} catch (InsufficientFunds e) {
			assertEquals(serverConstants.ErrorMessages.InsufficientFunds, e.getMessage());
			assertEquals(1000, acc.getBalance());
		}
	}

}
