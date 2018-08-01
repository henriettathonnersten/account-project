package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Account;

public class AccountTest { 

	Account account = new Account("Name", "Nameson", 1234123412341234L);
	
	@Test
	public void existanceCheck() {
		assertNotNull(account);
	}
	
	@Test
	public void getFirstName() {
		assertEquals("Not the expected first name", "Name", account.getFirstName());
	}
	
	@Test
	public void setFirstName() {
		account.setFirstName("Namn");
		assertEquals("Not the expected first name", "Namn", account.getFirstName());
	}
	
	@Test
	public void getLastName() {
		assertEquals("Not the expected last name", "Nameson", account.getLastName());
	}
	
	@Test
	public void setLastName() {
		account.setLastName("Namnsson");
		assertEquals("Not the expected last name", "Namnsson", account.getLastName());
	}
	
	@Test
	public void getAccountNumber() {
		assertEquals("Not the expected account number", 1234123412341234L, account.getAccountNumber());
	}
	
	@Test
	public void setAccountNumber() {
		account.setAccountNumber(4321432143214321L);
		assertEquals("Not the expected account number name", 4321432143214321L, account.getAccountNumber());
	}
	
	@Test 
	public void checkOutput() {
		assertEquals("Output not the on expected", "Account holder: Name Nameson. Account number: 1234123412341234.", account.outputAccountDetails());
	}
	
}
