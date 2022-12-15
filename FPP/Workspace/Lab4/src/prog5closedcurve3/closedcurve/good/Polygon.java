package prog5closedcurve3.closedcurve.good;

@FunctionalInterface
public interface Polygon {
	
    public double[] getArrayOfSides();
    
    static double sum(double[] arr) {
    	double sum = 0.0;
    	for(int i=0; i< arr.length; i++) {
    		sum += arr[i];
    	}
    	return sum;
    }
    
    default double computePerimeter() {
    	return sum(getArrayOfSides());
    }
}
