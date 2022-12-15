package prog3startup;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		//implement
		if(strArray.length == size) {
			resize();
			System.out.println("Resizing...");
		}
		strArray[size] = s;
		size ++;
	}
	
	public String get(int i){
		String message = "Not found";
		//implement
		if(i > strArray.length) {
			return message;
		}
		for(int j=0; j<strArray.length; j++) {
			if(j == i) {
				return strArray[i];
			}		
		}
		return message;
	}
	
	public boolean find(String s){
		//implement
		for(String r: strArray) {
			if(r.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		//implement
		if(strArray.length == size) {
			resize();
			System.out.println("Resizing...");
		}
		if(pos > strArray.length) {
			System.out.println("Index out of bound");;
		}
		
		String tempIni = strArray[pos];
		strArray[pos] = s;
		String tempLas;
		
		for(int i=pos; i<strArray.length-1; i++) {
			tempLas = strArray[i+1];
			strArray[i+1] = tempIni;
			tempIni = tempLas;
		}
		
		resize();
		size ++;
	}
		
	public boolean remove(String s){
		//implement
		int i=0;
		for(i=0; i<strArray.length; i++) {
			if(s.equals(strArray[i])) {
				break;
			}
		}
		if(i == strArray.length) {
			return false;
		}
		String[] temp = new String[strArray.length-i-1];
		System.arraycopy(strArray, i +1, temp, 0, strArray.length-i-1);
		int index =0;
		for(int j=i; j<strArray.length; j++) {
			strArray[j] = temp[index];
			if(++index >= temp.length) {
				break;
			}			
		}
		size--;
		return true;
	}
	
	private void resize(){
		//implement
		String[] tempArr = new String[strArray.length + size];		
		System.arraycopy(strArray, 0, tempArr, 0, strArray.length);
		strArray = new String[tempArr.length];
		strArray = tempArr;	
	}
	
	public String toString(){
		//implement
		String[] result = new String[strArray.length];
		int count = 0;
		
		for(int i=0; i<strArray.length; i++) {
			if(strArray[i] != null) {
				result[count] = strArray[i];
				count++;
			}
		}
		result = Arrays.copyOf(strArray, count);
		return Arrays.toString(result);
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.add("Steve");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.add("Susan");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.add("Mark");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);	
		l.remove("Mark");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		String getValue = l.get(2);
		System.out.println("The value of list is "+ getValue);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
	}

}
