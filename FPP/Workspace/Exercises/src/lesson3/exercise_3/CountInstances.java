package lesson3.exercise_3;

public class CountInstances {
	
	private static int count = 0;

	public int getCount() {
		return count;
	}

	public CountInstances() {
		count++;
	}
	
	public static void main(String[] args) {
		
		for(int i =0; i<10; i++) {
			new CountInstances();
		}
		
		CountInstances count1 = new CountInstances();
		count1.getCount();
		System.out.println(count1.getCount());
	}



}
