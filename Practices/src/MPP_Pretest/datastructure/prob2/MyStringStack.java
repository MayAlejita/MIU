package MPP_Pretest.datastructure.prob2;

public class MyStringStack {
	private Node top;
	
	//Pushes the string s onto the stack -- the top
	//Node is populated with this input String
	//If the input String is null, it is ignored
	public void push(String s) {
		//implement
		Node node = new Node();
		if(top != null){
			node.next = top;
		}
		top = node;
	}
	
	//Pops the stack -- the value stored in the top 
	//Node is returned. If the stack is empty
	//when pop() is called, pop() returns null.
	public String pop() {
		//implement
		String data = top.value;
		top = top.next;
		return data;
	}
	
	//DO NOT MODIFY
	//Returns a space-separated string consisting
	//of the elements of this stack
	public String toString() {
		return Util.toString(this);
	}

	//DO NOT MODIFY
	private class Node {
		private String value;
		private Node next;
	}
}
