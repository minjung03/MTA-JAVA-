package Day3;

// MTA 기출 4
public class Q06 {
	public static void main(String[] args) {
		
		double number = 27;
		
		number %= -3d; // number에 -3으로 나눈 나머지를 double로 넣기 => 0
		number += 10f; // number에 10을 더해 float로 넣기 => 10.0
		number *= -4;  // number에 -4를 곱하기 => -40.0
		
		System.out.println(number);
	}
}
