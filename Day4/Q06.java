package Day4;

// MTA ���� 6 (�� ���´�)
public class Q06 {

	public static void main(String[] args) {
		
		// String�� JVM�� String ���ͷ� ���̺��� �����Ѵ�.
		// ���� ���� ������ ���� �����!
		
		String s1 = "Hello World"; // s2�� ���� ��ü ����
		String s2 = "Hello World"; // s1�� ���� ��ü ����
		String s3 = s2; // s1, s2�� ���� ��ü ����
		
		String s4 = new String("Hello World"); // **��, ��ü�� �� ������ ����Ǿ� �Ź� ���Ӱ� ����� ���� ���ڿ��̴��� �������� �ʴ´�			
		
		// == �����ڴ� �ּҸ� ��
		if(s1 == s2) System.out.println("���� ��ü ����"); // ���� ��ü ���� 
		
		if(s1 == s4) System.out.println("���� ��ü ����"); 
		else System.out.println("���� ����");  // ���� ����
	
		s1 = "Hi"; // �ٸ� ���ڿ� �Ҵ� ����
		s2 = "Bye";
		System.out.println(s1+" "+s2);

	}
}
