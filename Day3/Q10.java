package Day3;

public class Q10 {
	
	// String 문제에서 알아두어야할 메서드
	public static void main(String[] args) {
		
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		a = a.concat(b); // concat(-) : 문자열 붙이기
		System.out.println("concat : "+a);
		
		a = a.trim(); // trim() : 앞뒤 공백 제거
		System.out.println("tirm : "+a);
		
		a = a.replace("C#","JAVA"); // replace(-,-) : 문자열 바꾸기
		System.out.println("replace : "+a);
		
		String s[] = a.split(","); // split(-) : -를 기준으로 나누기
		for(String value : s) { // for-each문 사용
			System.out.println("split : "+value);
		}
		
		a = a.substring(5); // substring(-) : -를 기준으로 자르기
		System.out.println("subString(5) : "+a);
		
		char c = a.charAt(2); // charAt(-) : -가 가르키는 index의 값(데이터) 출력
		System.out.println("charAt(2) : "+c);
		
	}

}
