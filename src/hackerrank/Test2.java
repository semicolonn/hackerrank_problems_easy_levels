package hackerrank;

public class Test2 {


	public static void main(String[] args) {
        int number = 124;
        splitDigits(number);
    }

    public static void splitDigits(int number) {
        if (number == 0) {
            System.out.println("0");
            return;
        }

        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.println(numberString.charAt(i));
        }
    }

}
