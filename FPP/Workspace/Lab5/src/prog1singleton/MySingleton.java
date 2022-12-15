package prog1singleton;

public class MySingleton {
	
	private static MySingleton singleton;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if(singleton == null) {
			singleton = new MySingleton();
		}
		return singleton;
	}

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(MySingleton.getInstance().hashCode());
		}
	}
}
