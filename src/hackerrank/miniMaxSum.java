package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class miniMaxSum {

	public static int countArrEl(List<Integer> arr) {

		// int[] arr= {1,2,3};

		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {

			sum = sum + arr.get(i);
		}
		System.out.println("Array size " + arr.size());
		return sum;

	}

	public static void test(List<Integer> arr) {

		if (arr.isEmpty()) {
			System.out.println("Empty list"); // Handle empty list case
			return;
		}

		long max = arr.get(0);
		long min = arr.get(0);
		long sum = 0;

		for (int i = 0; i < arr.size(); i++) { // Start from index 1 to compare with max and min

			sum += arr.get(i); // sum all numbers
		
			if (arr.get(i) < min) {
				min = arr.get(i); // find the smallest
			}
			if (arr.get(i) > max) {
				max = arr.get(i); // find the greatest
			}

		}

		System.out.print((sum - max)+ " " + (sum - min) );
	}

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3);
		// System.out.println(countArrEl(arr));

		test(numbers);

	}

}
