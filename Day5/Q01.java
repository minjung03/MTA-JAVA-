package Day5;

// MTA ���� 1
public class Q01 {

	public static void main(String[] args) {
		String[] arr = {"12345678910", "123"};
		System.out.println(validateEntries(arr));
	}
	
   public static boolean validateEntries(String[] entries) {
	  	boolean allValidEntries= true;
	 	 for (String entry : entries) {  // for-each���� �ۼ��ϴ� ��
	    	    if (entry.length() > 10) {
	      		   allValidEntries= false;
	       		   break;
	    	    }
	  	}
	  	return allValidEntries;
   }

}
