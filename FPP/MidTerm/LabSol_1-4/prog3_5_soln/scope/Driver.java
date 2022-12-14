package prog3_5_soln.scope;

import java.util.Scanner;

import prog3_5_soln.scope.more.*;

public class Driver {
	Scanner sc = new Scanner(System.in);
	String userID;
	StoreDirectory directory;
	final String CONTINUE = "Review more options? (Y/N)";
	String n = System.getProperty("line.separator");
	public static void main(String[] args){
		new Driver();
		
		
	}
	private String continueQuestion() {
		System.out.println(CONTINUE);
		return sc.nextLine();
		
	}
	Driver(){
		
		System.out.println("What is your Id? (An Id is a 3-digit code, like 009.)");
		String userId = sc.nextLine();
		storeId(userId);
		String n = System.getProperty("line.separator");
		String inputString = "Y";
		String outputString = null;
		displayOptions();
		while(!inputString.equalsIgnoreCase("N")){
			inputString = sc.nextLine();
			
			if(inputString.equalsIgnoreCase("A")){
				
				displayNumberOfBooks();
				
			}
			else if(inputString.equalsIgnoreCase("B")){
				
				displayNumberOfEmployees();
				
			}
			else if(inputString.equalsIgnoreCase("C")){
				outputString = "In Input Area, type in the employee number using this format:"+n+
							   "   add employee xxx"+n+
							   "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);
				
			}
			else if(inputString.equalsIgnoreCase("D")){
				
				outputString = "In Input Area, type in the book id number using this format:"+n+
				   "   book xxx"+n+
				   "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);				
				
			}
			else if(inputString.equalsIgnoreCase("E")){
				
				outputString = "In Input Area, type in the book number using this format:"+n+
				   "   add book xxx"+n+
				   "where 'xxx' is the 3-digit code for the book number.";
				System.out.println(outputString);				
				
			}
			else if(inputString.equalsIgnoreCase("F")){
				displayNumberOfCDsInBookstore();				
			}
			else if(inputString.equalsIgnoreCase("G")){

				outputString = "In Input Area, type in the cd number using this format:"+n+
				   "   add cd xxx"+n+
				   "where 'xxx' is the 3-digit code for the cd number.";
				System.out.println(outputString);						
				
			}
			else if(inputString.equalsIgnoreCase("H")){
				
				outputString = "In Input Area, type in the name of the food item using this format:"+n+
				   "   food nn..."+n+
				   "where 'nn...' represents the name of the food item (like bananas or cherries).";
				System.out.println(outputString);					
				
			}	
			else if(inputString.trim().startsWith("add employee")){  //add employee
				
				int len = "add employee".length();
				addEmployee(inputString.substring(len).trim());
			}
			else if(inputString.trim().startsWith("add book")){  //add book
				
				int len = "add book".length();
				
				addBook(inputString.substring(len).trim());
			}
			else if(inputString.trim().startsWith("add cd")){  //add cd
				int len = "add cd".length();
				addCD(inputString.substring(len).trim());
			}
			else if(inputString.trim().startsWith("book")){  //add cd
				int len = "book".length();
				checkIfBookIsInStock(inputString.substring(len).trim());
			}			
			else if(inputString.trim().startsWith("food")){  //add cd
				int len = "food".length();
				checkWhetherFoodItemInMarket(inputString.substring(len).trim());
			}	
			else if(inputString.trim().equalsIgnoreCase("Y")){
				displayOptions();
			}
			
			
			else {
				System.out.println(n+"I did not understand your response."+n);
				displayOptions();
			}
		
		    			
		}
		
		System.out.println("Have a nice day! Bye!");
		System.exit(0);
		
	}
	void storeId(String userID){
		this.userID = userID;
		directory = new StoreDirectory(userID);
	}
	//this implementation has been done for you
	void displayNumberOfBooks() {
		int numbooks = directory.getNumberOfBooks();
		if(numbooks > -1){
			System.out.println("Number of books is: "+ numbooks +n+CONTINUE);
		}
		
	}
	void displayNumberOfEmployees() {
		int numemps = directory.getNumberOfBookstoreEmployees();
		if(numemps > -1){
			System.out.println("Number of employees is: " + numemps+n+CONTINUE);
		}
		
	}
	
	void addEmployee(String employeeId){
		boolean result = directory.addNewEmployee(employeeId);
		if(result) {
			System.out.println("Employee "+employeeId+ " added." + n+CONTINUE);
		}
	}
	void addBook(String bookId){
		boolean result = directory.addNewBook(bookId);
		if(result) {
			System.out.println("Book "+bookId+" added." + n+CONTINUE);
		}
				
	}	
	void addCD(String cdId){
		boolean result = directory.addNewCD(Integer.parseInt(cdId));
		if(result) {
			System.out.println("CD "+cdId+" added." + n+CONTINUE);
		}
				
	}		
	void checkIfBookIsInStock(String bookId){
		boolean result = directory.bookIsInStock(bookId);
		if(result) {
			System.out.println("Yes, book with bookId "+bookId+" is in stock." +n+CONTINUE);
		}
		else {
			System.out.println("No, book with bookId "+bookId+ " is not in stock at this time.");
		}
		
	}
	
	void displayNumberOfCDsInBookstore(){
		int num = directory.getNumCDsInBookstore();
		if(num > -1) {
			System.out.println("Number of CD's is " + num+n+CONTINUE);
		}
			
	}
	void checkWhetherFoodItemInMarket(String foodItem){
		boolean result = directory.marketCarriesFoodItem(foodItem);
		if(result) {
			System.out.println("Yes, the market carries "+foodItem+n+CONTINUE);
		}
		else {
			System.out.println("No, the market does not carry "+foodItem+n+CONTINUE);
		}
		
	}
	
	void displayOptions(){
		String n = System.getProperty("line.separator");
		String display = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION"+n+n+
						 "A. Learn how many books are in bookstore."+n+
						 "B. Learn how many employees are in bookstore."+n+
						 "C. Add an employee to the bookstore."+n+
						 "D. See if a book is in stock in the bookstore."+n+
						 "E. Add a book to the bookstore."+n+
						 "F. Get number of CD's in the bookstore."+n+
						 "G. Add a new CD to the bookstore's stock."+n+
						 "H. See if the market carries a particular food item."+n+
						 "N. Exit the system."+n;
		System.out.println(display);
		
	}
	
	

}
