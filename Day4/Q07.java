package Day4;

// MTA ���� 7
public class Q07 {
	public static void main(String[] args) {
		System.out.println(showGreeting("kimMinJung"));
	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "�ȳ��ϼ���, ";
		welcomeMsg += (firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
		// substring()�� ~������ �������� ������ ���ڿ� �������� ��ȯ
		return welcomeMsg;
	}
}
