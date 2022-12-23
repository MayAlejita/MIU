package prog1closedcurve.closedcurve.good;

public class Square extends ClosedCurve {
	double side;
	
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
		if(side < 0) {
			throw new IllegalClosedCurveException(this.getClass().getSimpleName());
		}		
	}
	public Square(double side) throws IllegalClosedCurveException {
		this.side = side;
		if(side < 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a "+ this.getClass().getSimpleName());
		}
	}
	double computeArea() {
		return(side*side);
	}

}
