package prog2doublylinked;


public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	// inserts a new Node containing data so that its position in the list is now
	// pos
	void insert(String data, int pos) {
		if(pos == 0) {
			addFirst(data);
		}
		else {

			Node newNode = new Node(data);
			Node temp = header;
			Node tempP = header;
			
			for (int i = 0; i <= pos; i++) {
				if(temp.next == null) {
					if(i == pos) {
						addLast(data);
						return;
					}
					else {
						throw new IndexOutOfBoundsException("The position doesn't exist ");
					}
				}
				tempP = temp;
				temp = temp.next;
			}
			tempP.next = newNode;
			temp.previous = newNode;
			newNode.previous = tempP;
			newNode.next = temp;
		}
	}

	// attempts to remove the first Node that contains data; if successful, returns
	// true; otherwise, false.
	boolean remove(String data) {
		Node nodeRem = header.next;
		Node temp = nodeRem;
		Node tempP = nodeRem;
		
		if(nodeRem.value == data) {
			header.next = nodeRem.next;
			return true;
		}
		while(!nodeRem.value.equals(data)) {
			tempP = nodeRem;
			temp = nodeRem.next;
			nodeRem = nodeRem.next;		
			if(nodeRem == null) {
				return false;
			}
		}
		
		tempP.next = temp.next;
		if(temp.next != null) {
			temp.next.previous = tempP;
		}
		return true;
	}
	
	
	/******* sorting methods ********/
	public void minSort(){
		//implement
		if(header.next == null) {
			return;
		}
			
		Node node = header.next;
		Node nextNode;
		
		while (node.next != null) {		
			nextNode = minNode(node);
			swap(node, nextNode);
			node = node.next;
		}	
	}
	
	void swap(Node n1, Node n2){
		//implement
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;		
	}

	public Node minNode(Node n){	
		//implement	
		
		Node temp = n.next;
		Node min = n;
		
		while(true) {
			if(temp.value.compareTo(min.value) < 0) {
				min = temp;
			}
			temp = temp.next;
			if(temp == null) {
				break;
			}
		}
		return min;
		
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		
		list.insert("Ale", 1);
		System.out.println(list);
		
		list.remove("Harry");
		System.out.println(list);
		
		
		String[] testArr = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
		
		MyStringLinkedList listL = new MyStringLinkedList();
		for(int i = 0; i < testArr.length; ++i) {
			listL.insert(testArr[i], i);
		}
		
		System.out.println(listL);
		listL.minSort();
		System.out.println(listL);
	}
}
