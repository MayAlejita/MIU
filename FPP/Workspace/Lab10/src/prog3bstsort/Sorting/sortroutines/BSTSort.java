package sortroutines;

import java.util.Random;

import runtime.Sorter;

public class BSTSort extends Sorter{

	private MyBST bst = new MyBST();
	

	
	@Override
	public int[] sort(int[] arr) {
		
		bst.insertAll(arr);
		int[] sortedArray = bst.readIntoArray();
		return sortedArray;
	}
	
	
	public static void main(String[] args) {
		int[] intArrayTest = new int[10];
		
	
		for(int i = 0; i < 10; i++){	
			Random rand = new Random();
	        // Generate random integers in range 0 to 999
			intArrayTest[i]= rand.nextInt(1000);
	        
		}
		
		BSTSort bs = new BSTSort();
		//long startTime = SortTester .time();
		int[] sortedArray = bs.sort(intArrayTest);
		
		System.out.println("Sorted array: ");
		for (int i : sortedArray) 
			System.out.printf(i+" ");
	}
	
}

