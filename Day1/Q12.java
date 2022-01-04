package Day1;
// MTA 기출 9
public class Q12 {

	public static void main(String[] args) {
		
		int age = 30;
		int income = 30000;
		
		// 조건 중 하나를 충족해야한다.
		// 65세 초과 고령자이며 최소 연간 소득이 10,000 이상
		// 21세 이상이며 연간 소득이 25,000를 초과
		if(age > 65 && income >= 10000 || age >= 21 && income > 25000) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Declined");
		}
	}
}
