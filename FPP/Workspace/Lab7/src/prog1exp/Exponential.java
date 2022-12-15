package prog1exp;

public class Exponential {

	public static void main(String[] args) {
		Exponential exp = new Exponential();
		double result = exp.power(2, 10);
		
		System.out.println("Exponential: " + result);

	}

	private double power(double x, int n) {	

		if(n == 1 || x == 0) {
			return x;
		}
		else if(n ==0) {
			return 1;
		}

		return power(x, n - 1) * x;
	}
}
