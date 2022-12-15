package prog3round;

public class Prog3 {
	
	public static void main(String[] args) {
		float a = 1.27F;
		float b = 3.881F;
		float c = 9.6F;
		
		int sum = (int) (a + b + c);
		int sumRound = Math.round(a + b + c);
		
		System.out.println("Sum: " + sum);
		System.out.println("Rounded sum: " + sumRound);
	}

}
