package prog2schur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schur {
		
	static boolean checkForSum(List<Integer> list, Integer z) {
		
		var value = new HashMap<Integer, Integer>();	
		Integer index = 0;
		
		for(Integer i : list) {
			value.put(index++, z - i);
		}
		
		for(Map.Entry<Integer, Integer> v : value.entrySet()) {
			if(list.contains(v.getValue())){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{11, 9, 15, 21, 26});
		Integer z = 32;
		
		System.out.println(checkForSum(list, z));
		
	}
}
