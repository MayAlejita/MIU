package prog4_5_soln.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon {
	final double side;
	public Square(Double side){
		this(side.doubleValue());
	}
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side * side);
	}
	public double[] getArrayOfSides() {
		return new double[] {side, side, side, side};
	}
	
		
}
