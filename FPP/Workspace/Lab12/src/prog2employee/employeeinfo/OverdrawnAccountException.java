package prog2employee.employeeinfo;

public class OverdrawnAccountException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public OverdrawnAccountException (){
		super();
	}
	
	public OverdrawnAccountException (String msg){
		super(msg);
	}

}
