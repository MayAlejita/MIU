package prog4_5_soln.closedcurve.good;

public interface Polygon {
	public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double sum = 0.0;
		for(double d : arr) {
			sum += d;
		}
		return sum;
	}
	
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}

}
