package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static int sockMerchant(int n, List<Integer> ar) {

		int pairCounter = 0;

		for (int i = 0; i < ar.size() - 1; i++) {
			for (int j = 1+1; j < ar.size(); j++) {
				if (ar.get(i).equals(ar.get(j))) {
					pairCounter++;
					ar.remove(j); // Remove the matched element to avoid counting it again
					break; // Exit the inner loop after finding a pair

				}
			}
		}

		return pairCounter;

	}

	public static void main(String[] args) {

        List<Integer> socks = new ArrayList<>(List.of(10,11,20,10,11,22));	
        int pairs = sockMerchant(socks.size(), socks);

		System.out.println("Number of pairs: " + pairs); // Output: Number of pairs: 3
	}

}


