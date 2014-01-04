package org.mmtg;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testPostiveNumber() {
		assertEquals("square of 5 is ", 25, Sample.square(5));
	}

	@Test
	public void testNegativeNumber() {
		assertEquals("square of -5 is ", 25, Sample.square(-5));
	}

	@Test
	public void testZeroNumber() {
		assertEquals("square of 0 is ", 0, Sample.square(0));
	}
}
