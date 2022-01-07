package Day4;

// MTA 기출 6 (꼭 나온다)
public class Q06 {

	public static void main(String[] args) {
		
		// String은 JVM이 String 리터럴 테이블에서 관리한다.
		// 같은 값이 있으면 같이 사용함!
		
		String s1 = "Hello World"; // s2와 같은 개체 참조
		String s2 = "Hello World"; // s1과 같은 개체 참조
		String s3 = s2; // s1, s2와 같은 개체 참조
		
		String s4 = new String("Hello World"); // **단, 객체는 힙 영역에 저장되어 매번 새롭게 만드니 같은 문자열이더라도 공유하지 않는다			
		
		// == 연산자는 주소를 비교
		if(s1 == s2) System.out.println("같은 개체 참조"); // 같은 개체 참조 
		
		if(s1 == s4) System.out.println("같은 개체 참조"); 
		else System.out.println("같지 않음");  // 같지 않음
	
		s1 = "Hi"; // 다른 문자열 할당 가능
		s2 = "Bye";
		System.out.println(s1+" "+s2);

	}
}
