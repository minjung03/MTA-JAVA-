package Day1;
import java.util.Scanner;
//MTA ���� 11
public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 Ź�� 2 ��� 3 ��ȣ 4 �ҷ�");
		Object data1 = sc.next(); // �� �ܾ� �а� ����
		Object data2 = sc.next(); // �� �ܾ� �а� ����
		Object data3 = sc.nextInt(); // �ϳ��� ���� �а� ����
		Object data4 = sc.nextLine(); // ���� ������ ���� �д´�
		// ����Ű������ �Է��� ���� �����´�
		
		System.out.println(data1+"\n"+data2+"\n"+data3+"\n"+data4);
	}
}
