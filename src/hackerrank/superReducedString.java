package hackerrank;

public class superReducedString {

	
	    public static String superReducedString_(String s) {
	        StringBuilder sb = new StringBuilder(s);

	        for (int i = 1; i < sb.length(); i++) {
	            if (sb.charAt(i) == sb.charAt(i - 1)) {
	                sb.delete(i - 1, i + 1);
	                i = 0;
	            }
	        }

	        if (sb.length() == 0) {
	            return "Empty String";
	        }

	        return sb.toString();
	    }
	


	public static void main(String[] args) {

		System.out.print(superReducedString_("aaabbbcssd"));
	}

}
