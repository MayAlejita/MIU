package prog5closedcurve3.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sidesS = {side, side, side, side};
		return sidesS;
	}
}
