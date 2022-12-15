package lesson3.callbyvalueorreference;

public class CallByValueObjects {
	public static void main(String[] args) {
		CallByValueObjects c = new CallByValueObjects();
		Employee a = new Employee("Alice","Thompson", 60000, 1995, 2, 10);
		Employee b = new Employee("Bob","Rogers", 70000, 1997, 10, 1);
		
		Employee d = a;
		System.out.println(d.getName());
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		c.swap(a, b);
		//Cannot change value of a by sending a to a method
		System.out.println(a.getName());
		System.out.println(a);
		System.out.println(b.getName());
	}
	public void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		//System.out.println(x.getName());
		y = temp;
		//System.out.println(x.getName());
	}

}
