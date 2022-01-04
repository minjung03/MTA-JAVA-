package Day1;
import java.util.Scanner; // 생일을 읽어야하니 알맞는 클래스? import
//MTA 기출 8
public class Q11 {

	public static void main(String[] args) {
		System.out.println(getBirthdate());

	}
	
	public static String getBirthdate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오");
			
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next(); // 문자열을 읽을 때는 그냥 next() 
		// next() : 스페이스 즉 공백 전까지 입력받은 문자열을 리턴
		
		sc.close(); // 닫아주기
	    return birthdate;
	}

}
