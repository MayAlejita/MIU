package prog5reverse;

public class Prog5 {
	
	public static void main(String[] args) {
		
		String initial = "Hello";	
		String reverse = "";
		char a;
		
		for(int i=0; i<initial.length(); i++) {
			a = initial.charAt(i);
			reverse = a + reverse;
		}

		System.out.println("String initial: " + initial);
		System.out.println("String reverse: " + reverse);		
		
		
		
		double x= 3 * 5 / 9 % 2;
		double b= 4 ^ 3 & 5;
		double c= 13 >> 2 << 2 ^ 4;
		double d= 32 | 16/3 >> 2 & 5; 
		System.out.println(x + " - " + b + " - " +c + " - " + d);
	}
	
}
