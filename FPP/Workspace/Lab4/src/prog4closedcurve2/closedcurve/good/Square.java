package prog4closedcurve2.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	private static final int sidesSquare = 4;
	
	public Square(double side){
		this.side = side;
		
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}
	
	@Override
	public int getNumberOfSides() {
		return sidesSquare;
	}

	@Override
	public double computePerimeter() {
		return 4 * side;
	}
}
