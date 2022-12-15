package lesson3.solution_exercise.exercise_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Date date = dateFromLocalDate(LocalDate.of(1970, 1, 1));
		//num hours = milliseconds/60 * 60 * 1000 
		long numHours = date.getTime()/(60 * 60 * 1000);
		//output numHours to the console
		System.out.println(numHours);
		
		///////////////
		
		date = dateFromLocalDate(LocalDate.of(1970, 1, 2));
		//num hours = milliseconds/60 * 60 * 1000 
		numHours = date.getTime()/(60 * 60 * 1000);
		//output numHours to the console
		System.out.println(numHours);

	}

	public static Date dateFromLocalDate(LocalDate localDate) {
		Calendar cal = new GregorianCalendar(localDate.getYear(), 
				localDate.getMonth().getValue()-1,
				localDate.getDayOfMonth());
		return cal.getTime();

	}
}
