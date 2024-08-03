package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aVeryBigSum {

	public static int testaVeryBigSum(List<Integer> ar) {

		int sum = 0;

		for (int i = 0; i < ar.size(); i++) {

			sum = sum + ar.get(i);

		}
		return sum;

	}

	public static long aVeryBigSum(List<Long> ar) {

		long sum = 0;

		for (int i = 0; i < ar.size(); i++) {

			sum = sum + ar.get(i);

		}
		return sum;

		/*
		 * n this challenge, you are required to calculate and print the sum of the
		 * elements in an array, keeping in mind that some of those integers may be
		 * quite large.
		 * 
		 * Function Description
		 * 
		 * Complete the aVeryBigSum function in the editor below. It must return the sum
		 * of all array elements.
		 * 
		 * aVeryBigSum has the following parameter(s):
		 * 
		 * int ar[n]: an array of integers .
		 * 
		 * Return
		 * 
		 * long: the sum of all array elements
		 * 
		 * Input Format
		 * 
		 * The first line of the input consists of an integer . The next line contains
		 * 
		 * space-separated integers contained in the array.
		 * 
		 * Output Format
		 * 
		 * Return the integer sum of the elements in the array.
		 * 
		 * Constraints
		 * 
		 * 
		 * 
		 */

	}

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(4);
		System.out.println(testaVeryBigSum(a));

		List<Long> ar = new ArrayList<>();

		ar.add((long) 1000000001);
		ar.add((long) 1000000002);
		ar.add((long) 1000000003);
		ar.add((long) 1000000004);
		ar.add((long) 1000000005);
		System.out.println(aVeryBigSum(ar));

	}

}
