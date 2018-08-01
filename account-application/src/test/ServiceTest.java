package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Service;

public class ServiceTest {

	Service service = new Service();
	String firstName = "Name";
	String lastName = "Nameson";
	
	@Test
	public void existanceCheck() {
		assertNotNull(service);
	}
	
	@Test
	public void addAccount() {
		assertEquals("Account was not added", 1, service.addAccount(firstName, lastName, 1234123412341234L)); 
	}
	
	@Test
	public void retrieveAccount() {
		service.addAccount(firstName, lastName, 1234123412341234L);
		assertEquals("Account was not found", true, service.checkForAccount(0)); 
	}
	
	@Test
	public void removeAccount() {
		service.addAccount(firstName, lastName, 1234123412341234L);
		assertEquals("Account was not removed", true, service.removeAccount(0)); 
	}
	
}
