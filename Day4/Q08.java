package Day4;

// MTA 기출 8
public class Q08 {
	public static void main(String[] args) {
		
		int timer = 60;
		
		while(timer >= 0) { // 0보다 크거나 같을 때까지
			if(timer == 0) break; // 타이머가 0이되면 종료
			else {
				System.out.println("타이머가 카운트 다운 중입니다.."+ timer);
				timer--; // 0이 될 때까지 타이머 감소
			}
		}
	}
}
