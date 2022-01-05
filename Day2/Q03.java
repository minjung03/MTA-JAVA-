package Day2;

//for-each문 예제 3가지
public class Q03 {

	enum Week { // 사용자 정의 타입
		월,화,수,목,금,토,일
	}
	
	public static void main(String[] args) {
		
		// 1. int형 배열
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num) {
			sum += k;
		}
		System.out.println("합은 "+sum);
		
		
		// 2. String형 배열
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		for(String s : names) {
			System.out.println(s+" ");
		}
		
		// 3. 사용자 정의 타입 ( enum _ {} )
		for(Week day : Week.values()) {
			System.out.print(day+"요일 ");
		}
		
	}

}
