package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Service;

public class ServiceTest {

	Service service = new Service();
	
	@Test
	public void existanceCheck() {
		assertNotNull(service);
	}
	
	@Test
	public void addAccount() {
		//return 1, as that is the next available ID.
		assertEquals("Account was not added", 16, service.addAccount("Name", "Nameson", 1234123412341234L)); 
	}
	
	@Test
	public void retrieveAccount() {
		//service.addAccount(firstName, lastName, 1234123412341234L);
		assertEquals("Account was not found", true, service.checkForAccount(0)); 
	}
	
	@Test
	public void removeAccount() {
		//service.addAccount(firstName, lastName, 1234123412341234L);
		assertEquals("Account was not removed", true, service.removeAccount(11)); 
	}
	
	@Test
	public void getJSON() {
		assertEquals("Output not expected", "{\"0\":{\"firstName\":\"Name1\",\"lastName\":\"Namesson1\",\"accountNumber\":12345612345611}," 
				+ "\"1\":{\"firstName\":\"Name2\",\"lastName\":\"Namesson2\",\"accountNumber\":12345612345612},\"" 
				+ "2\":{\"firstName\":\"Name3\",\"lastName\":\"Namesson3\",\"accountNumber\":12345612345613}}", service.getJSON());
	}
	
}
