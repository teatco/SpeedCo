package main;
import java.util.*;

public class Route {
	private List<Stop> stops=new ArrayList<Stop>();
	private String routeName;

	public Route(String routeName) {
		this.setRouteName(routeName);
	}

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
	public void addStop(Stop stop) {
		this.stops.add(stop);
	}
	
	public String toString() {
		return "Route Name: "+this.routeName+", Stops at: "+this.stops;
	}
	
}
