package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		//String result = test.concatente("one", "two");
		assertEquals("onetwo", result);
		//assertEquals("twoone", result);
	}

}
