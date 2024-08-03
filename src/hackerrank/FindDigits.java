package hackerrank;

public class FindDigits {


    public static int findDigits(int n) {
    // Write your code here
    	
        int counter=0;
        String numberString = String.valueOf(n);

        for (int i = 0; i < numberString.length(); i++) {
                int divisor = Integer.parseInt(String.valueOf(numberString.charAt(i)));            if (divisor != 0 && n % divisor == 0){
                   counter++;
            }
        }
        return counter;
        }

    
	
	
	public static void main(String[] args) {
		
		System.out.print(findDigits(1224));
	}

}
