package prog1closedcurve.closedcurve.good;

public class IllegalTriangleException extends IllegalClosedCurveException{

	private static final long serialVersionUID = 1L;
	
	public IllegalTriangleException (){
		super();
	}
	
	public IllegalTriangleException (String msg){
		super(msg);
	}

}
