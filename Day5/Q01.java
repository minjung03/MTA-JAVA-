package Day5;

// MTA 기출 1
public class Q01 {

	public static void main(String[] args) {
		String[] arr = {"12345678910", "123"};
		System.out.println(validateEntries(arr));
	}
	
   public static boolean validateEntries(String[] entries) {
	  	boolean allValidEntries= true;
	 	 for (String entry : entries) {  // for-each문을 작성하는 것
	    	    if (entry.length() > 10) {
	      		   allValidEntries= false;
	       		   break;
	    	    }
	  	}
	  	return allValidEntries;
   }

}
