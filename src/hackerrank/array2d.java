package hackerrank;

public class array2d {

	public static void main(String[] args) {
		
		//i = row
		//j = column

	      int[][] arr = { { 1, 2 }, { 3, 4 } };
	      int temp=0;
	      int r=0;
	      int l=0;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {

	                //System.out.print(arr[i][j] + " ");
  	      
	                temp= arr[i][j]-1;
	                
	                r= temp-1;
	                
	                

	            }
	            System.out.println();
	            
	        }
            System.out.println("---------------");
            System.out.println(temp);

	    }
	}
