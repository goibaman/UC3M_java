package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Bank.Account;

public class AccountTest {

	private Account account = null;
	
	@Before
	public void setUp() throws Exception {
		account = new Account("John", 4300);
	}

	@Test
	public void test() {
		account.withdraw(1350);
		assertEquals(2950,account.getBalance(),0);
	}

	@Test
	public void testGetHolder() {
	    assertNotNull(account.getHolder());
	}
}
