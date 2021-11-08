package main;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpeedCoWorkflow {
   private List<Bus> buses = new ArrayList<Bus>();
   private List<Stop> stops = new ArrayList<Stop>();
   private List<Route> routes = new ArrayList<Route>();
   private List<Line> lines = new ArrayList<Line>();
   private List<Schedule> Schedules=new ArrayList<Schedule>();
   
	public SpeedCoWorkflow() {
	}
	
	public void addBus(String rego) {
		buses.add(new Bus(rego));
	}
	
	public void removeBus(String rego) {
		Stream<Bus> stream = buses.stream();
	    List<Bus> updatedBuses = stream.filter(b ->(! b.getRego().equals(rego))).collect(Collectors.toList());
	    this.setBuses(updatedBuses);
	}
	
	public void addStop(String code) {
		stops.add(new Stop(code));
	}
	
	public void removeStop(String code) {
		Stream<Stop> stream=stops.stream();
		List<Stop> updatedStops=stream.filter(s->(!s.getStopCode().equals(code))).collect(Collectors.toList());
		this.setStops(updatedStops);	
	}
	
	public void addRoute(String routeName) {
		if(routeName.equals("M44")) {
			Route route =new Route(routeName);
			this.stops.stream().forEach((s)->route.addStop(s));
			routes.add(route);
				
			Route reversal =new Route(routeName);
			for(int i =this.stops.size()-1;i>-1;i--) {
				reversal.addStop(this.stops.get(i));
			}
			routes.add(reversal);
		}
		else if(routeName.equals("J1")){
			Route route =new Route(routeName);
			for(int i=0; i<2; i++) {
				route.addStop(this.stops.get(i));
			}
			routes.add(route);
					
			Route reversal =new Route(routeName);
			for(int i =1;i>-1;i--) {
				reversal.addStop(this.stops.get(i));
			}
			routes.add(reversal);
			
		}
		else {
			System.out.println("not suppoted");
		}

	}
	
	public void removeRoute(String routeName) {
		Stream<Route> stream=routes.stream();
		List<Route> updatedRoutes=stream.filter(r->(!r.getRouteName().equals(routeName))).collect(Collectors.toList());
		this.setRoutes(updatedRoutes);
	}
	
	public void addLine(Route forwardRoute, Route returnRoute) {		
		this.lines.add(new Line (forwardRoute, returnRoute));
	}
	
	public void removeLine(Line line) {
		Stream<Line> stream=lines.stream();
		List<Line> updatedRoutes=stream.filter(l->(l!=line)).collect(Collectors.toList());
		this.setLines(updatedRoutes);
	}
	
	public void schedule ( Bus bus, Date date, Line line) {
		this.Schedules.add(new Schedule(bus, date, line));
	}

	public List<Bus> getBuses(){
		return this.buses;
	}
	
	public void setBuses(List<Bus> buses) {
		this.buses=buses;
	}

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public List<Line> getLines() {
		return lines;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	public List<Schedule> getSchedules() {
		return Schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		Schedules = schedules;
	}
}
