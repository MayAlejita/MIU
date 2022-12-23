package prog3extracredit;

public class SearchForString {

	private String[] arr;

	public SearchForString(String[] arr) {
		this.arr = arr;
	}

	public boolean search(String s) {
		int len = arr.length;
		if(s.equals(arr[len -1])) {
			return true;
		}	
		return recurSearch(s, len - 1);		
	}

	private boolean recurSearch(String s, int upperIndex) {
		if(upperIndex == 0) {
			return false;
		}
		if(s.equals(arr[upperIndex - 1])) {
			return true;
		}
		return recurSearch(s, upperIndex - 1);
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"a", "b", "c", "d"};
		SearchForString search = new SearchForString(arr);
		boolean a = search.search("bn");
		System.out.println(a);
		
	}
}