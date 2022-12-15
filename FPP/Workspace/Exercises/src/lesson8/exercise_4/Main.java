package lesson8.exercise_4;

import java.util.*;

@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		List list1 = Arrays.asList("A", "B", "C");
		List list2 = Arrays.asList("W", "X", "Y");
		List[] listOfLists = {list1, list2};
		System.out.println(Arrays.toString(listOfLists));
		
		List<String> listL1= new ArrayList<String>();
		listL1.add("A");
		listL1.add("B");
		listL1.add("C");
		
		List<String> listL2= new ArrayList<String>();
		listL2.add("W");
		listL2.add("X");
		listL2.add("Y");
		
		ArrayList<List<String>> listO = new ArrayList<List<String>>();
		listO.add(listL1);
		listO.add(listL2);
		System.out.println(listO);
	}
}
    //////Output
    //[[A, B, C], [W, X, Y]]



