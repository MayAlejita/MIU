package prog1objects;

public class Main {
	public static void main(String[] args) {
		
		Address add1A = new Address("Schiller Park", "Chicago", "IL", "60176");
		Address add1B = new Address("Maharishi Vedic City", "Fairfield", "IA", "52556");
		Address add2A = new Address("Manhattan", "New York", "NY", "10005");
		Address add2B = new Address("Rukmapura", "Fairfield", "IA", "52556");
		
		Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
		c1.setBillingAddress(add1A);
		c1.setShippingAddress(add1B);

		Customer c2 = new Customer("Mayra", "Pullupaxi", "772-221-4444");
		c2.setBillingAddress(add2A);
		c2.setShippingAddress(add2B);
		
		Customer[] cusArray = new Customer[2];
		cusArray[0] = c1;
		cusArray[1] = c2;
		
		/*
		 *  Print to the console all those Customers whose billingAddress is located in the city of Chicago 
		 */
		for(int i = 0; i < cusArray.length; ++i) {
			
			String address = cusArray[i].getBillingAddress().getCity();
			if(address.equals("Chicago")) {
				System.out.println("Customer: " + cusArray[i].toString());
			}
		}
		
	}

}
