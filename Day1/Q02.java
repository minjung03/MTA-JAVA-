package Day1;

public class Q02 {

	public static void main(String[] args) {
		int a = 3, b=3, c=3;
		
		a += 3; // 6
		b *= 3; // 9
		c %= 2; // 1 **
		
	    System.out.println("a="+ a +", b="+b +", c="+c);
	    
	    int d = 3;
	    
	    // �̷� ���� ���� ����**
	    
	    // Ʋ�� �� ������ �������� !	    
	    // �ڿ� ���̴� �����ڴ� ���� ����� �� ��ȭ��Ų��*** �򰥸��� ����!!
	    
	    a = d++; // 3, 4 **a�� ���� ���� ����� �� ��ȭ
	    System.out.println("a="+a+", d="+d);
	    
	    a = ++d; // 5, 5
	    System.out.println("a="+a+", d="+d);
	    
	    a = d--; // 5, 4 **a�� ���� ���� ����� �� ��ȭ
	    System.out.println("a="+a+", d="+d);
	    
	    a = --d; // 3, 3
	    System.out.println("a="+a+", d="+d);
	}
}
