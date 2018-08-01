package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.Main;

public class MainTest {
	
	@Test
	public void outputTest() {
		assertEquals("Output not the one expected", "Hello world!", Main.getOutput());
	}
	

}
