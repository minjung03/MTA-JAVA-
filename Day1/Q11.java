package Day1;
import java.util.Scanner; // ������ �о���ϴ� �˸´� Ŭ����? import
//MTA ���� 8
public class Q11 {

	public static void main(String[] args) {
		System.out.println(getBirthdate());

	}
	
	public static String getBirthdate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�");
			
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next(); // ���ڿ��� ���� ���� �׳� next() 
		// next() : �����̽� �� ���� ������ �Է¹��� ���ڿ��� ����
		
		sc.close(); // �ݾ��ֱ�
	    return birthdate;
	}

}
