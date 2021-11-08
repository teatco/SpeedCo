package main;

public class Bus {
	private String rego;
	
	public Bus(String rego) {
		this.setRego(rego);
	}

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}
	
	public String toString() {
		return "Bus Rego: "+this.rego;
	}

}
