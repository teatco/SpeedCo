package main;
import java.util.Date;

public class Main {
	private static SpeedCoWorkflow speedCo=new SpeedCoWorkflow();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding buses 
		System.out.println("Adding buses with thier rego");
		speedCo.addBus("ABC-123");
		speedCo.addBus("ABC-124");
		speedCo.addBus("ABC-125");
        System.out.println(speedCo.getBuses());
       
        //removing buses
        System.out.println("\n");
		System.out.println("Removing buses with thier rego");
		speedCo.removeBus("ABC-124");
		speedCo.removeBus("ABC-125");
        System.out.println(speedCo.getBuses());
        
        System.out.println("\n");
		System.out.println("Adding stops with thier code");
		speedCo.addStop("A1");
		speedCo.addStop("B11");
		speedCo.addStop("B15");
		speedCo.addStop("Z15");
		speedCo.addStop("G1");
		speedCo.addStop("Z51");
        System.out.println(speedCo.getStops());
        
        //removing stops
        System.out.println("\n");
		System.out.println("Removing stops with thier code");
		speedCo.removeStop("B11");
		speedCo.removeStop("Z15");
        System.out.println(speedCo.getStops());
        
        //adding routes
        System.out.println("\n");
		System.out.println("Adding routes with thier name");
		speedCo.addRoute("M44");
		speedCo.addRoute("J1");
        System.out.println(speedCo.getRoutes());
        
        //removing routes
        System.out.println("\n");
		System.out.println("Removing routes with thier name");
		speedCo.removeRoute("M44");
        System.out.println(speedCo.getRoutes());

        
        //adding line
        System.out.println("\n");
      	System.out.println("Adding line");
      	speedCo.addLine(speedCo.getRoutes().get(0), speedCo.getRoutes().get(1) );
        System.out.println(speedCo.getLines());
        
        //Removing line
        System.out.println("\n");
        System.out.println("Removing line");
        speedCo.removeLine(speedCo.getLines().get(0));
        System.out.println(speedCo.getLines());
        
        //schedule Bus
        System.out.println("\n");
      	speedCo.addLine(speedCo.getRoutes().get(0), speedCo.getRoutes().get(1) );
        speedCo.schedule(speedCo.getBuses().get(0), new Date(), speedCo.getLines().get(0));
        System.out.println(speedCo.getSchedules());

	}

}
