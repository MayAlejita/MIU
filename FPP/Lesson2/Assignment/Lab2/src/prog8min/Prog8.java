package prog8min;

public class Prog8 {
	
	public static void main(String[] args) {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = min(arr);
		System.out.println("The number is " + result);
	}
	
	static int min(int[] arraysOfInt) {

		int min = arraysOfInt[0];		
		for(int i=0; i<arraysOfInt.length; i++) {
				if(arraysOfInt[i] < min) {
					min = arraysOfInt[i];			
			}			
		}			
		return min;
	}

}
