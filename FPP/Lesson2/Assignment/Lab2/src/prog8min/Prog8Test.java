package prog8min;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Prog8Test {
	
	@Test
	public void testMin() {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = Prog8.min(arr);
		int expected = -22;
		
		assertTrue(expected == result);
		
	}

}
