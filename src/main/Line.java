package main;
import java.util.Collections;
import java.util.List;

public class Line {
	private Route forwardRoute=null;
	private Route returnRoute=null;
	
	public Line(Route forwardRoute, Route returnRoute ) {
		this.setForwardRoute(forwardRoute);
		this.setReturnRoute(returnRoute);
	}

	public Route getReturnRoute() {
		return returnRoute;
	}

	public void setReturnRoute(Route returnRoute) {
		this.returnRoute = returnRoute;
	}

	public Route getForwardRoute() {
		return forwardRoute;
	}

	public void setForwardRoute(Route forwardRoute) {
		this.forwardRoute = forwardRoute;
	}
	
	public String toString() {
		return "Forward route: "+this.forwardRoute+" Return Route: "+this.returnRoute;
	}

}
