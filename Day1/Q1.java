package Day1;

// MTA 기출 1
public class Q1 {
	public static void main(String[] args) {
		
		  double pi = Math.PI; // 3.141593
		  
		  System.out.format("PI is %.3f%n", pi); 
		  // 소수점 3자리까지 출력 (4번째 자리에서 반올림***) => 3.14"2"
		  System.out.format("PI is %.0f%n", pi);
		  // 소수로 만들지 말 것 => 3
		  System.out.format("PI is %09f%n", pi); 
		  // 소수점도 하나의 자리이다**
		  // "앞"의 빈자리는 0으로 채우고, 전체 9자리까지 출력 => 03.141593
		}
}
