package prog4foreach.lab8_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));		
	}
	
	public void printAsUpperCase() {
		//implement		
		listOfAddresses.forEach(address -> System.out.println(formatFields(address.toUpper())));
		
	}
	
	private String formatFields(List<String> list) {
		//implement
		output = new StringBuilder();			   
		output.append(String.format("%s", list.get(0))).append("\n").append(String.format("%s", list.get(1))).append("\n")
		.append(String.format("%s", list.get(2))).append(", ").append(String.format("%s", list.get(3))).append(" ")
		.append(String.format("%s", list.get(4))).append("\n");
		
		return output.toString();
	}
}
