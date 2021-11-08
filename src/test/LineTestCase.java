package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.Line;
import main.Route;
import main.Stop;

class LineTestCase {

	@Test
	void test() {
		String routeName ="H30";
		Stop stop1=new Stop("A40");
		Stop stop2=new Stop("A41");

		List<Stop> stops1=new ArrayList<Stop>();
		stops1.add(stop1);
		stops1.add(stop2);
		
		List<Stop> stops2=new ArrayList<Stop>();
		stops2.add(stop2);
		stops2.add(stop1);
		
		Route routeForward=new Route(routeName);
		routeForward.setStops(stops1);
		Route routeReturn=new Route(routeName);
		routeReturn.setStops(stops2);
		
		Line line =new Line(routeForward,routeReturn );
		
		
		
		assertEquals(routeForward, line.getForwardRoute());
		assertEquals(routeReturn, line.getReturnRoute());
	}

}
