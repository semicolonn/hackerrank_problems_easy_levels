package hackerrank;

public class array2dim {

	
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)
 
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }
	
    
    //total the array elements
    
    public static void sumArr(int arr[]) {
    	int sum=0;

        for (int i = 0; i < arr.length; i++) {

        	sum=sum+arr[i];
        }
        System.out.print(sum);

    }

    
    
    
    
    
	public static void main(String[] args) {
		
		
		int[] a= {2,4,1};
	
		sumArr(a);
	}

}
