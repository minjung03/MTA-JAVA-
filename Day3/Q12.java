package Day3;
import java.util.*;

// ArrayList<> ���� �ǽ�
public class Q12 {
	public static void main(String[] args) {
		
		// ���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) { // 4�� �ݺ�
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s =  scanner.next();
			a.add(s); // ArrayList�� �߰�
		}
		
		
		// ArrayList ���
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name+" ");
		}
		
		
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
			// **�� ���ڿ� ����� "����"�� �˾ƾ��ϴ�, a.get(i)��ġ�� .lenght() �޼��带 ���!!
				longestIndex = i;
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longestIndex));
		
		scanner.close();
	}
}	
