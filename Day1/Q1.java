package Day1;

// MTA ���� 1
public class Q1 {
	public static void main(String[] args) {
		
		  double pi = Math.PI; // 3.141593
		  
		  System.out.format("PI is %.3f%n", pi); 
		  // �Ҽ��� 3�ڸ����� ��� (4��° �ڸ����� �ݿø�***) => 3.14"2"
		  System.out.format("PI is %.0f%n", pi);
		  // �Ҽ��� ������ �� �� => 3
		  System.out.format("PI is %09f%n", pi); 
		  // �Ҽ����� �ϳ��� �ڸ��̴�**
		  // "��"�� ���ڸ��� 0���� ä���, ��ü 9�ڸ����� ��� => 03.141593
		}
}
