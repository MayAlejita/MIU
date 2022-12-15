package lesson3.solution_exercise.exercise_3;

public class CountInstances {
	private static int count = 0;
	public static int getCount() {
		return count;
	}
	public CountInstances() {
		++count;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			new CountInstances();
		}
		System.out.println((new CountInstances()).count);

	}

}
