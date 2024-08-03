package hackerrank;

public class staircare {

	public static void main(String[] args) {
		
        for (int i = 0; i < 8; i++) {
        	
            for (int j = 0; j < 8; j++) {
            	
                if (i + j < 8 - 1)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
		
	}

}
