package Day3;

// MTA 기출 1
public class Q03 {
	public static void main(String[] args) {
		
		char data1 = 65;
		System.out.println(data1);
		
		long data2 = 65;
		System.out.println(data2);
		
		float data3 = new Float("-65.0");
		System.out.println(data3);
		
		short data4 = new Short("65.0"); // NumberFormatException 예외 발생
		System.out.println(data4);
	}

}
