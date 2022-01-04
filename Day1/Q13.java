package Day1;
// MTA 기출 10
public class Q13 {

	public static void main(String[] args) {
		int number = 10; // 숫자로된 기본 원시 변수
		// ** Integer number = 10; 로 수정하면 text3는 실행된다
		
		// String text1 = '' + number; 
		// 오류 - String 타입에 값을 넣는데 ''는 사용 불가
		
		String text2 = "" + number;
		// 잘 변환한다
		
		// String text3 = number.toString();
		// 오류 - number가 "원시변수"이므로 toString()는 사용불가
		
		String text4 = String.valueOf(number);
		// 잘 변환된다 - valueOf() : 숫자 형태로 변환할 때 사용 / 문자열을 숫자로 변환할 때도 사용

	}

}
