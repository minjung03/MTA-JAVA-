package Day1;
// MTA 기출 7
public class Q10 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// improt 문이 없다면 이렇게 사용할 수 있음
		
		while(input.hasNext()) { // 조건문을 판별하기 위해서는 true/false가 필요하다. hasNext()는 반환이 boolean타입이니 hasNext()를 사용.
								 // "다음 토큰이 있냐 물어보는 것"
			System.out.println(input.next()); // next()는 다음 요소 값을 가져온다 (토큰 단위로/단어를 하나씩 출력)
		}
	}
}
