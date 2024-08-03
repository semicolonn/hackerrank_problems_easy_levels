package hackerrank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

	

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        Collections.sort(candles); // Sort the candles in ascending order

        int count = 0; 
        int tallestHeight = candles.get(candles.size() - 1); // Get the tallest candle height

        for (int i = candles.size() - 1; i >= 0; i--) { // Start from the end, as the tallest candles are at the end after sorting
            if (candles.get(i) == tallestHeight) {
                count++; // Increment count for each tallest candle
            } else {
                break; // Stop iterating as the rest will be smaller
            }
        }

        return count;
    }
    
	public static void main(String[] args) {
		
		List<Integer> c = List.of(3,2,1,3);
		
		System.out.print(birthdayCakeCandles(c));

	}

}
