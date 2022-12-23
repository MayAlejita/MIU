package prog3extracredit;

public class MyArrayQueue {
	private int[] arr = new int[10]; 
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int val) {
		if (front == -1) {
			front = 0;
		} 
		if (rear == arr.length) {
			resize();
		}
		arr[rear++] = val;
		size++;
	}
	
	private void resize() {

		int[] arrResize = new int[arr.length * 2];
		System.arraycopy(arr, front, arrResize, 0, size);
		front = 0;
		rear = size;
		arr = arrResize;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalArgumentException();
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

}
