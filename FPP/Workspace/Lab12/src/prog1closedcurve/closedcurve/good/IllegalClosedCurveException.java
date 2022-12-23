package prog1closedcurve.closedcurve.good;

public class IllegalClosedCurveException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public IllegalClosedCurveException (){
		super();
	}
	
	public IllegalClosedCurveException (String msg){
		super(msg);
	}

	public IllegalClosedCurveException (Throwable t){
		super(t);
	}
}
