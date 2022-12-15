package prog3merge;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	LinkedList<Integer> list3 = new LinkedList<>();
	
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		//implement
		if(list1.isEmpty() && list2.isEmpty()){
			return list3;
		}
		if(list1.isEmpty()) {
			list3.addAll(list2);
			return list3;
		}
		if(list2.isEmpty()) {
			list3.addAll(list1);
			return list3;
		}
		
		Integer first1 = list1.get(0);
		Integer first2 = list2.get(0);
		
		if(first1 < first2) {
			list1.remove(first1);
			list3.add(first1);
		}
		
		if(first2 < first1) {
			list2.remove(first2);
			list3.add(first2);		
		}
		
		list3 =  merge(list1, list2);
		return list3;
	}
	
	//test your code
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		
		Merge m = new Merge();
		LinkedList<Integer> list3 = m.merge(list1, list2);
		if(list3 != null) 
			System.out.println(list3);
		
	}
}
