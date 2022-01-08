package Day5;

// MTA 기출 2
public class Q02 {

	public static void main(String[] args) {
		System.out.println(fee('T'));
	}
	
	public static int fee(char model) {
		int price = 0;
		switch(model) {
		  case 'A' : price = 50; break;
		  case 'T' : price = 20; // break문이 없다! 주의하자**
		  case 'C' : price = 5; break;
		  default : price = 100; break;
		}
		return price;
	}
}
