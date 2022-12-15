package prog6remove;

import java.util.Arrays;

public class Prog6 {
	
	public static void main(String[] args) {
		
		String[] input = {"horse", "dog", "cat", "horse","dog"};
		String[] result = removeDups(input);
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(result));
	}
	
	public static String[] removeDups(String[] input) {

		String[] result = new String[input.length];
		
		int count = 0;
		
		ok: for(int i=0; i<input.length; i++){	
			if(i == 0) {
				result[i] = input[i];
				count++;
			}
			else {	
				for(int j=0; j<result.length; j++) {
					
					if(input[i].equals(result[j])) {
						continue ok;
					}			
				}
				result[i] = input[i];
				count++;
			}
		}
		
		String[] finalResult = null;
		if(count >0) {
			finalResult = new String[count];
			for(int i=0; i < count; i++) {
				finalResult[i] = result[i];
			}
		}
		return finalResult;
	}

}
