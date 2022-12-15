package lesson3.callbyvalueorreference.demo;

public class CallByValueObjects {
	public static void main(String[] args) {
		CallByValueObjects c = new CallByValueObjects();
		Employee a = new Employee("Alice","Thompson", 60000, 1995, 2, 10);
		Employee b = new Employee("Bob","Rogers", 70000, 1997, 10, 1);
		System.out.println(a);
		Employee d = a;
		//System.out.println(d);
		
		System.out.println("before" + a.getNickName());
		c.swap(a, b);
		//To which Employee does the reference a point?
		System.out.println("after "+ a.getNickName());
	}
//	public void swap(Employee x, Employee y) {
//		System.out.println(x.getName());
//		Employee temp = x;
//		x = y;
//		System.out.println(x.getName());
//		y = temp;
//		System.out.println(y.getName());
//	}
	
	public void swap(Employee x, Employee y) {
		System.out.println(x.getNickName());
		String temp = x.getNickName();
		x.setNickName(y.getNickName());
		System.out.println(x.getName());
		y.setNickName(temp);
		System.out.println(y.getName());
	}

}
