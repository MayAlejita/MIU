package prog4closedcurve2.closedcurve.good;

public final class Rectangle extends ClosedCurve implements Polygon{
	private final double width;
	private final double length;
	private static final int sides = 4;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		return width * length;
	}

	@Override
	public int getNumberOfSides() {
		return sides;
	}

	@Override
	public double computePerimeter() {
		return width + width + length + length;
	}
}
