package Day3;
import java.util.*;

// ArrayList<> 예제 실습
public class Q12 {
	public static void main(String[] args) {
		
		// 문자열만 삽입 가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) { // 4번 반복
			System.out.print("이름을 입력하세요 >> ");
			String s =  scanner.next();
			a.add(s); // ArrayList에 추가
		}
		
		
		// ArrayList 출력
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name+" ");
		}
		
		
		int longestIndex = 0;
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
			// **각 문자열 요소의 "길이"를 알아야하니, a.get(i)위치의 .lenght() 메서드를 사용!!
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));
		
		scanner.close();
	}
}	
