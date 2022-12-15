package prog3improvedemployee.employeeinfo;

import java.util.Arrays;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] strArray; 
	private int size;
	
	public AccountList() {
		strArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s){
		//implement
		if(strArray.length == size) {
			resize();
		}
		strArray[size] = s;
		size ++;
	}
	
	public Account get(int i){
		//implement
		if(i > strArray.length) {
			return null;
		}
		for(int j=0; j<strArray.length; j++) {
			if(j == i) {
				return strArray[i];
			}		
		}
		return null;
	}
	
	public boolean find(Account s){
		//implement
		for(Account r: strArray) {
			if(r.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(Account s, int pos){
		//implement
		if(strArray.length == size) {
			resize();
		}
		if(pos > strArray.length) {
			System.out.println("Index out of bound");;
		}
		
		Account tempIni = strArray[pos];
		strArray[pos] = s;
		Account tempLas;
		
		for(int i=pos; i<strArray.length-1; i++) {
			tempLas = strArray[i+1];
			strArray[i+1] = tempIni;
			tempIni = tempLas;
		}
		
		resize();
		size ++;
	}
		
	public boolean remove(Account s){
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
		Account[] temp = new Account[strArray.length-i-1];
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
		Account[] tempArr = new Account[strArray.length + size];		
		System.arraycopy(strArray, 0, tempArr, 0, strArray.length);
		strArray = new Account[tempArr.length];
		strArray = tempArr;	
	}
	
	public String toString(){
		//implement
		Account[] result = new Account[strArray.length];
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

	/*public static void main(String[] args){
		AccountList l = new AccountList();
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
	}*/

}
