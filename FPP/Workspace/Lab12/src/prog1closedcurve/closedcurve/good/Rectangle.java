package prog1closedcurve.closedcurve.good;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		this.length = length;
		this.width = width;
		if(width < 0 || length < 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a "+ this.getClass().getSimpleName());
		}
	}
	double computeArea() {
		return width*length;
	}
	


}
