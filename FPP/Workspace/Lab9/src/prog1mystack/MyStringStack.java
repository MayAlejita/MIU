package prog1mystack;

public class MyStringStack {
	private MyStringLinkedList list;
	
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		if(list != null && list.size() > 0) {
			String remove = peek();
			list.remove(0);
			return remove;
		}
		else {
			return null;
		}
		
	}
	
	public String peek() {
		//implement
		if(list != null && list.size() > 0) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	public void push(String s) {
		//implement
		list.add(s);
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	public static void main(String[] args) {
		
		MyStringStack stack = new MyStringStack(); 
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		
		System.out.println(stack.toString()); 		
		System.out.println("Popping..."+stack.pop()); 
		
		System.out.println(stack.toString()); 
		System.out.println("Peeking...."+stack.peek()); 
		
		System.out.println(stack.toString());
		System.out.println("Popping..."+stack.pop());
		System.out.println(stack.toString());
	}
}
