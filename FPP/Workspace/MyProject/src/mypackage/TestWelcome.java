package mypackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWelcome {
	@Test
	public void testWelcome() {
		String result = Welcome2.welcome();
		assertEquals("Welcome", result);
	}

}
