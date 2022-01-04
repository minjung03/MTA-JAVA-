package Day1;

// MTA 기출 5 (오답률 매우 높다)
public class Q08 {
	
	public static void main(String[] args) {
		int anum = 55;
		
		for(int cnt = 0; cnt < 10; cnt++) {
			add(anum);
		}
		System.out.println(anum); // "55" 아래의 anum과는 "다른" 변수이다
								  // 원래의 anum에는 아무런 변화가 없음 
		
		// System.out.println(cnt); - 범위 벗어남 오류*
	}
	public static void add(int anum) {
		anum++; // 위의 anum과는 "다른" 변수이다. (이 anum은 매개변수)
		System.out.println(anum); // "56" : 매번 새롭게 55를 받아 증가시키니 56이 반복적으로 출력된다
	}
}

