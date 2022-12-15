package prog4_5_soln.closedcurve.good;

public final class Circle extends ClosedCurve {
	final double radius;
	public Circle(Double radius){
		this(radius.doubleValue());
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
