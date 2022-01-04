package Day1;
// MTA 기출 6
public class Q9 {

	public static void main(String[] args) {
		printInt();
	}
	
	public static void printInt() {
		if(true) {
			int num = 1; // if 블럭 안에서 선언되었으니 이 안에서만 존재함
			if(num>0) {
				num++;
			}
		}
		
		int num = 1; 
		addOne(num); // 영향 없음
		num = num - 1;
		System.out.println(num); // 0
	}
	
	public static void addOne(int num) {
		num = num+1; // 위의 num과는 다른 변수이다
	}

}
