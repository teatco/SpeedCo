package main;
import java.util.Date;

public class Schedule {
	
	private Bus bus=null;
	private Date time =null;
	private Line line=null;
	
	public Schedule(Bus bus, Date time, Line line) {
		this.setBus(bus);
		this.setTime(time);
		this.setLine(line);
		
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}


	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public String toString() {
		return "Bus with the Rego: "+this.bus.getRego()+" is scheduled to run at: "+this.time.toString()+"  on the Line: "+line;
	}

}
