package Day1;
// MTA ���� 10
public class Q13 {

	public static void main(String[] args) {
		int number = 10; // ���ڷε� �⺻ ���� ����
		// ** Integer number = 10; �� �����ϸ� text3�� ����ȴ�
		
		// String text1 = '' + number; 
		// ���� - String Ÿ�Կ� ���� �ִµ� ''�� ��� �Ұ�
		
		String text2 = "" + number;
		// �� ��ȯ�Ѵ�
		
		// String text3 = number.toString();
		// ���� - number�� "���ú���"�̹Ƿ� toString()�� ���Ұ�
		
		String text4 = String.valueOf(number);
		// �� ��ȯ�ȴ� - valueOf() : ���� ���·� ��ȯ�� �� ��� / ���ڿ��� ���ڷ� ��ȯ�� ���� ���

	}

}
