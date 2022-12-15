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
		
	}
	
}
