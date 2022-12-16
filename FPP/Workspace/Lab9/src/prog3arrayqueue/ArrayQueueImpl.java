package prog3arrayqueue;


public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public int peek() {
		if(isEmpty()) {
			throw new IllegalArgumentException("Cannot peek because Queue is empty!");
		}
		if(front <= rear) {
			return arr[front];
		}		
		return -1;
	}

	public int dequeue() {
		int data;
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue because Queue is empty!");
		}		
		if (front <= rear) {
			data = arr[front];
			arr[front] = 0;
			front ++;
			size--;
		} 
		else {
			throw new ArrayIndexOutOfBoundsException("Array Index out of range");
		}
		return data;
	}

	public void enqueue(int data) {
		if (front == -1) {
			front = 0;
		} 
		if (rear == arr.length) {
			resize();
		}
		arr[rear++] = data;
		size++;
	}

	private void resize() {

		int[] arrResize = new int[arr.length * 2];
		System.arraycopy(arr, front, arrResize, 0, size);
		front = 0;
		rear = size;
		arr = arrResize;
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		// uncomment when ready
		for(int i = 0; i < 15; i ++) {
			q.enqueue(i);
		}

		for(int i = 0; i < 14; i ++) {
			q.dequeue();
		}
					
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}
