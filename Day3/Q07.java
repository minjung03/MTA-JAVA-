package Day3;

//MTA ���� 5
public class Q07 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int c = ++a * b--; // 6 * 10 (����� ���� �� b�� 9�� ����)
		System.out.println(c);
		
		int d = a-- + ++b; // 6 + 10 (9�� ���� b�� 10�� ����, ����� ���� �� a�� 5�� ����)
		System.out.println(d);
		
	}
}
