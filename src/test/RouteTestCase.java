package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import main.Route;
import main.Stop;

class RouteTestCase {

	@Test
	void test() {
		String routeName ="H30";
		Stop stop=new Stop("A40");
		List<Stop> stops=new ArrayList<Stop>();
		stops.add(stop);
		Route route=new Route(routeName);
		route.setStops(stops);
		
		
		
		assertEquals(routeName, route.getRouteName());
		assertEquals(stops, route.getStops());

	}

}
