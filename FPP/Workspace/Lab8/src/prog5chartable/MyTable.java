package prog5chartable;

public class MyTable {
	private Entry[] entries;
	private int temp = 0;
	
	public MyTable() {
		entries = new Entry[26];
	}

	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		String getResult = "";
		for (int i = 0; i < entries.length; i++) {
			if(entries[i] != null && c == entries[i].ch) {
				getResult = entries[i].str;
			}
		}
		return getResult;
	}
	
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {		
		//implement
		Entry entry = new Entry(s, c);
		entries[temp] = entry;
		temp++;
	}
	
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		String result = "";
		for (int i = 0; i < entries.length; i++) {
			if(entries[i] != null){
				result += entries[i].ch + " -> " + entries[i].str + "\n";			
			}
		}
		return result;
	}
	
	private class Entry {
		private String str;
		private char ch;
		
		Entry(String str, char ch){
			//implement
			this.str = str;
			this.ch = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			return this.ch + " -> " + this.str;
		}
	}
	
	public static void main(String[] args) {
		 MyTable t = new MyTable();
	     t.add('a', "Andrew");
	     t.add('b', "Billy");
	     t.add('c', "Charlie");
	     
	     System.out.println(t);
	     
	     String s = t.get('b');
	     System.out.println(s);
	}

}