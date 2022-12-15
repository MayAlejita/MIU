package prog2rand;

public class Prog2 {
	public static void main(String[] args){
		
		int x = RandomNumbers.getRandomInt(1, 9);
		double xResult = Math.pow(Math.PI, x);
		
		System.out.println("The number x is: " + x + " and the result π ^ x is: "+ xResult);
		
		
		int y = RandomNumbers.getRandomInt(3, 14);
		double yResult = Math.pow(y, Math.PI);
		
		System.out.println("The number y is: " + y + " and the result y ^ π  is: "+ yResult);
		
	}

}
