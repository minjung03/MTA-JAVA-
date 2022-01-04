package Day1;
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		
		switch(score / 10) {
			case 10 : // **(주의)case 10이 없으면 100점은 default로 가버린다
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F';
		}
		
		System.out.println("학점은 "+grade+"입니다");
		scanner.close();
	}
}
