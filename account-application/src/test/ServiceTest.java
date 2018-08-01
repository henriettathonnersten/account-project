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
		assertEquals("Account was not added", 19, service.addAccount("Name", "Nameson", 1234123412341234L)); 
	}
	
	@Test
	public void retrieveAccount() {
		assertEquals("Account was not found", true, service.checkForAccount(0)); 
	}
	
	@Test
	public void removeAccount() {
		assertEquals("Account was not removed", true, service.removeAccount(11)); 
	}
	
	@Test
	public void getJSON() {
		assertEquals("Output not expected", "{\"8\":{\"firstName\":\"Gary\",\"lastName\":\"Namesson1\",\"accountNumber\":12345612345611}," 
				+ "\"6\":{\"firstName\":\"Gary\",\"lastName\":\"Namesson2\",\"accountNumber\":12345612345612},\"" 
				+ "7\":{\"firstName\":\"Name3\",\"lastName\":\"Namesson2\",\"accountNumber\":12345612345613}}", service.getJSON());
	}
	
	@Test
	public void getFirstName() {
		assertEquals("Name not found", "There are 2 Gary's.", service.getMostCommonFirstName("Gary"));
	}
	
}
