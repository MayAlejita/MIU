package prog7format;

public class Main {

	public static void main(String[] args) {
		String output = "";
				
		for(int i = 0; i < 2; ++i){
			for(int j = 0; j < 1; ++j){
				output = String.format("%16d %12d %12d %12d %n %n", 
						RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
				output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", 
						RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
				output += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
				output += String.format("%n %n %n");
				
				System.out.println(output);
			}
		System.out.println();
		}
	}

}
