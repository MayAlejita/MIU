package prog1closedcurve.closedcurve.good;

public class Circle extends ClosedCurve {
	double radius;
	
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
		if(radius< 0) {
			throw new IllegalClosedCurveException(this.getClass().getSimpleName());
		}
	}
	public Circle(double radius) throws IllegalClosedCurveException {
		this.radius = radius;
		if(radius< 0) {
			throw new IllegalClosedCurveException(this.getClass().getSimpleName());
		}
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
