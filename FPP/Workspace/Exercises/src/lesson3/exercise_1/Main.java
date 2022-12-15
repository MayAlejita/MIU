package lesson3.exercise_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Date date = dateFromLocalDate(LocalDate.of(1970, 1, 1));
		long numHours = date.getTime()/(60*60*1000); //implement
		System.out.println(numHours);

		date = dateFromLocalDate(LocalDate.of(1970, 1, 2));
		numHours = date.getTime()/(60*60*1000); //implement
		System.out.println(numHours);

	}

	public static Date dateFromLocalDate(LocalDate localDate) {
		//implement
		GregorianCalendar calendar = new GregorianCalendar(localDate.getYear(), 
				localDate.getMonth().getValue() -1, localDate.getDayOfMonth());
		Date date = calendar.getTime();
		return date;
	}
}
