package prog1department;

public class Professor extends DeptEmployee{

	private int numberOfPublications;

	public Professor(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}	
	
}
