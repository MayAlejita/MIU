package prog3comparator.employeesort;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getHireDate().compareTo(e2.getHireDate()) < 0) {
			return -1;
		} else if (e1.getHireDate().compareTo(e2.getHireDate()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}


}
