package org.mmtg;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MathUtilTest {

	@Test
	public void testUnsortedPostiveNumbersOddLength() {
		int[] src = { 24, 7, 4, 2, 3, 9, 2, 3, 6, 19, 2, 12, 44, 3, 55 };
		assertEquals("", 6.0d, MathUtil.median(src), 0d);
	}

	@Test
	public void testUnsortedPostiveNumbersEvenLength() {
		int[] src = { 24, 6, 5, 2, 3, 9, 2, 3, 7, 19, 2, 12, 44, 3 };
		assertEquals("median for " + Arrays.toString(src), 5.5d,
				MathUtil.median(src), 0d);
	}

	@Test
	public void testUnsortedNumbersEvenLength() {
		int[] src = { 24, 6, -5, 2, -3, 9, -2, 3, -7, 19, 2, 12, 44, 3 };
		assertEquals("when input contains both postive and negative number",
				3.0d, MathUtil.median(src), 0d);
	}
}
