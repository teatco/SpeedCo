package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Bus;

class BusTestCase {

	@Test
	void test() {
		String rego ="ATA-434";
		Bus bus=new Bus(rego);
		
		assertEquals(rego, bus.getRego());
	}

}
