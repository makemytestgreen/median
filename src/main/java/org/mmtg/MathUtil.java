package org.mmtg;

import java.util.Arrays;

public class MathUtil {
	public static double median(int[] numbers) {
		if (numbers == null)
			throw new NullPointerException("null array not permitted");
		if (numbers.length == 0)
			throw new IllegalArgumentException(
					"cannot determine median for empty array");
		if (numbers.length == 1)
			return numbers[0];
		if (numbers.length == 2)
			return ((double) numbers[0] + numbers[1]) / 2.0;

		// copy array so that we do not modify the client data.
		numbers = numbers.clone();
		Arrays.sort(numbers);
		int size = numbers.length;
		boolean isOddSize = (size % 2 == 1);

		if (isOddSize) {
			return numbers[size / 2];
		} else {
			int middle2 = numbers[size / 2];
			int middle1 = numbers[(size / 2) - 1];
			return ((double) middle1 + middle2) / 2.0;
		}
	}
}