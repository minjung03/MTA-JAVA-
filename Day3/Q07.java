package Day3;

//MTA 기출 5
public class Q07 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int c = ++a * b--; // 6 * 10 (계산이 끝난 뒤 b가 9로 감소)
		System.out.println(c);
		
		int d = a-- + ++b; // 6 + 10 (9로 변한 b가 10로 증가, 계산이 끝난 뒤 a가 5로 감소)
		System.out.println(d);
		
	}
}
