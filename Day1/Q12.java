package Day1;
// MTA ���� 9
public class Q12 {

	public static void main(String[] args) {
		
		int age = 30;
		int income = 30000;
		
		// ���� �� �ϳ��� �����ؾ��Ѵ�.
		// 65�� �ʰ� ������̸� �ּ� ���� �ҵ��� 10,000 �̻�
		// 21�� �̻��̸� ���� �ҵ��� 25,000�� �ʰ�
		if(age > 65 && income >= 10000 || age >= 21 && income > 25000) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Declined");
		}
	}
}
