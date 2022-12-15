package lesson1.solution_exercise.exercise_2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lesson1.exercise_1.MyClass;

public class TestMyClass {
	
	@Test
	public void testProduct() {
		int[] arr = {1, 2, 3};
		int result = MyClass.product(arr);
		assertTrue(result == 6);
		
	}
	
	@Test
	public void testConcatenate() {
		String[] arr = {"Bob", " ", "Joe"};
		String result = MyClass.concatenate(arr);
		String expected = "Bob Joe";
		//assertTrue(result.equals("Bob Joe"));
		assertEquals(expected, result);
		
	}
}
