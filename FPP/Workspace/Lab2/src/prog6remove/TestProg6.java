package prog6remove;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TestProg6 {
	
	@Test
	public void testRemoveDups() {
		
		String[] expected = {"horse", "dog", "cat"};
		String[] testData = {"horse", "dog", "cat", "horse","dog"};
	    String[] result = Prog6.removeDups(testData);
	    
	    assertTrue(Arrays.equals(expected, result));
	}

}
