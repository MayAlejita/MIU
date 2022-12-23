package prog1mystack;

public class NodeStack {

	private Node topNode = null;
	
	public void push(String val) {
		if(val.isEmpty() || val == null) {
			return;
		}
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = topNode;
		topNode = newNode;

	}

	public String peek() {
		if(topNode == null) {
			return null;
		}

		String top = topNode.data;
		return top;
	}

	public String pop() {
		if(topNode == null) {
			return null;
		}
		String top = peek();
		topNode = topNode.next;
		return top;
	}

	class Node {
		private String data;
		private Node next;

		Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

		Node() {
		}
	}
	
	
	
	@Override
	public String toString() {
		return "NodeStack [topNode=" + topNode.data + "]";
	}

	public static void main(String[] args) {
		
		NodeStack stack = new NodeStack(); 
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
