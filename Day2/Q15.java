package Day2;

// MTA ���� 6
public class Q15 {

	   public static void main(String[] args) {

		 	String firstName = "Christopher";
			firstName = firstName.substring(0,5); // ó������ 5���� �߶󳻱�

			String output = String.format("%s is %d chracters long" , firstName, firstName.length());
		    System.out.println(output);                                 // %s           %d
		    
       }
}
