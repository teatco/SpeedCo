package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Bus;
import main.Stop;

class StopTestCase {

	@Test
	void test() {
		String code ="A1";
		Stop stop=new Stop(code);
		
		assertEquals(code, stop.getStopCode());
	}

}
