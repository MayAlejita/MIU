package lesson8.exercise_6;

import java.util.*;

@SuppressWarnings({ "serial", "unused" })
public class Main {
	
	public static void main(String[] args) {
		List<String> list1 = dataList1();
		List<String> list2 = dataList2();
		List<String> list3 = dataList3();
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//Step 1: Sort each list
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
			
		//Step 2: Assemble the sorted lists into a single collection of lists
		List<String> listOfList = new ArrayList<>();
		
		listOfList.addAll(list1);
		listOfList.addAll(list2);
		listOfList.addAll(list3);
		
		System.out.println("List of List -----> " + listOfList);
		
		//Step 3: Sort the combined list using a Comparator. Declare that
		//listA comes before listB if the 0th element of A precedes the 0th
		//element of B. Then print the combined list to the console
				
		Collections.sort(listOfList);
		System.out.println(listOfList);

		List<List<String>> listOfList1 = new ArrayList<>();
		listOfList1.add(list1);
		listOfList1.add(list2);
		listOfList1.add(list3);
		System.out.println(listOfList1);
		
		
//		
//		var all = Arrays.asList(list1, list2, list2);
//		
//		Collections.sort(all, new ListComparator());
//		
//		
		Collections.sort(listOfList, (l1, l2) -> l1.compareTo(l2));
		
		System.out.println("------>" + listOfList);

	}

	
	private static List<String> dataList1() {
		return new ArrayList<String>() {
			{
				add("Joe"); add("Bill");add("Sue");
				add("Rob"); add("Mohammed");add("Steven");
			}
		};
	}

	private static List<String> dataList2() {
		return new ArrayList<String>() {
			{
				add("Rick"); add("Sally");add("Tom");
				add("George"); 
			}
		};
	}

	private static List<String> dataList3() {
		return new ArrayList<String>() {
			{
				add("Talia"); add("Richard");add("Chloe");
				add("Celine"); add("Zahra");add("Rod");
				add("Frank");
			}
		};

	}


//	public int compare(String o1, String o2) {
//		if(o1.compareTo(o2) < 0) {
//			return -1;			
//		}
//		else if(o1.compareTo(o2) > 0) {
//			return 1;
//		}
//		return 0;
//	}

}
