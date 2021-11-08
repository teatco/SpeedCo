package main;

public class Stop {

	private String stopCode;
	
	public Stop(String stopCode) {
		this.setStopCode(stopCode);
		
	}
	public String getStopCode() {
		return stopCode;
	}
	public void setStopCode(String stopCode) {
		this.stopCode = stopCode;
	}
	
	public String toString() {
		return "Stop Code: "+this.stopCode;
	}

}
