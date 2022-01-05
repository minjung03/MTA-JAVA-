package Day3;
import java.util.ArrayList;

// MTA 扁免 8
public class Q13 {

    public static void Process(ArrayList<String> invoices) {
  	  for(int i = 0;  i < invoices.size();) {
	   
	     String invoice = invoices.get(i);
  	     // TODO : 没备辑 贸府
	     invoices.remove(i);
	     System.out.println(invoices);
	     
	  }
    }
    
    public static void main(String[] args) {
    	ArrayList<String> ex = new ArrayList<>();
    	ex.add("1");
       	ex.add("2");
       	ex.add("3");
       	ex.add("4");
      	ex.add("5");
       	
    	Process(ex);
    }
}
