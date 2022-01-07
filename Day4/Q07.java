package Day4;

// MTA 기출 7
public class Q07 {
	public static void main(String[] args) {
		System.out.println(showGreeting("kimMinJung"));
	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "안녕하세요, ";
		welcomeMsg += (firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase());
		// substring()은 ~까지를 지정하지 않으면 문자열 끝까지를 반환
		return welcomeMsg;
	}
}
