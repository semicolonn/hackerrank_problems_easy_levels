package hackerrank;

import java.text.DecimalFormat;

public class plusMinus {

	public static void main(String[] args) {
		int[] arr = { -1, 1, 1, 0, -2, 22 };

		DecimalFormat df = new DecimalFormat("0.000000");

		int positives = 0;
		int negatives = 0;
		int zeros = 0;

		for (int num : arr) { 
			if (num > 0) {
				positives++;
			} else if (num < 0) {
				negatives++;
			} else {
				zeros++;
			}
		}

		System.out.printf("%.6f%n",(double) positives / arr.length);
		System.out.printf("%.6f%n",(double) negatives / arr.length);
		System.out.printf("%.6f%n",(double) zeros / arr.length);

	}

}
