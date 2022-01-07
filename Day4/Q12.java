package Day4;

//MTA ±âÃâ 12
public class Q12 {
	public static void main(String[] args) {		
		countdown(10);
	}
	
	public static void countdown(int start) {
		for(int i=start; i>=0; --i) {
			System.out.println(i);
		}
	}
}
