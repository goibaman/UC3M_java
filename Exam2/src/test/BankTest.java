package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Bank.Account;
import Bank.Bank;

public class BankTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Bank bank = new Bank(50);
		Account account = new Account("John", 500);
		bank.createAccount(account);
		bank.displayAccounts();
	}

}
