package prog4_2_soln.closedcurve.good;

public final class Rectangle extends ClosedCurve {

	private final double width;
	private final double length;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
