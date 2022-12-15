package prog4parse;

public class Prog4 {
	
	public static void main(String[] args) {
		
		String myString = Data.records;
		String[] rows = myString.split(":");
		String[] column;
		
		System.out.println("The productId are:");
		for(String row : rows) {
			column = row.split(",");
			System.out.println(column[0]);
		}
	}

}
