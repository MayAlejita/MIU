package prog2minsort;

public class MinSort {

	public static void main(String[] args) {
		
		String s = "zwxuabfkafutbbbb";
		MinSort ms = new MinSort();
		String result = ms.sort(s);
		System.out.println(result);
	}
	
	private String sort(String s) {

		if(s == null || s.length() == 0) {
			return "";
		}
		int minPos = minpos(s, 0, s.length()-1);
		String a = swap(s, 0, minPos);
		
		StringBuilder sb1 = new StringBuilder(a);
		sb1.deleteCharAt(0);			
		return a.charAt(0) + sort(sb1.toString());
	}
	
	private String swap(String s, int posIni, int posL) {
		StringBuilder result = new StringBuilder(s);
		result.setCharAt(posIni, s.charAt(posL));
		result.setCharAt(posL, s.charAt(posIni));
		return result.toString();
	}

	private int minpos(String s, int bottom, int top) {
		char min = s.charAt(bottom);
		int index = bottom;
		
		for (int i = index + 1; i <= top; i++) {
			if(s.charAt(i) < min) {
				min = s.charAt(i);
				index = i;
			}			
		}
		return index;
	}
		
}
