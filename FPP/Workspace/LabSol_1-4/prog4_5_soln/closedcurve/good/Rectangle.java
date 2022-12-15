package prog4_5_soln.closedcurve.good;

public final class Rectangle extends ClosedCurve implements Polygon {

	private final double width;
	private final double length;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width * length;
	}
	
	public double[] getArrayOfSides() {
		return new double[] {width, width, length, length};
	}
	
	

}
