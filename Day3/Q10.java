package Day3;

public class Q10 {
	
	// String �������� �˾Ƶξ���� �޼���
	public static void main(String[] args) {
		
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		a = a.concat(b); // concat(-) : ���ڿ� ���̱�
		System.out.println("concat : "+a);
		
		a = a.trim(); // trim() : �յ� ���� ����
		System.out.println("tirm : "+a);
		
		a = a.replace("C#","JAVA"); // replace(-,-) : ���ڿ� �ٲٱ�
		System.out.println("replace : "+a);
		
		String s[] = a.split(","); // split(-) : -�� �������� ������
		for(String value : s) { // for-each�� ���
			System.out.println("split : "+value);
		}
		
		a = a.substring(5); // substring(-) : -�� �������� �ڸ���
		System.out.println("subString(5) : "+a);
		
		char c = a.charAt(2); // charAt(-) : -�� ����Ű�� index�� ��(������) ���
		System.out.println("charAt(2) : "+c);
		
	}

}
