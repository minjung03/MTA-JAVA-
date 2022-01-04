package Day1;
import java.util.Scanner;
//MTA 기출 11
public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1 = sc.next(); // 한 단어 읽고 다음
		Object data2 = sc.next(); // 한 단어 읽고 다음
		Object data3 = sc.nextInt(); // 하나의 숫자 읽고 다음
		Object data4 = sc.nextLine(); // 남은 라인을 전부 읽는다
		// 엔터키까지의 입력을 전부 가져온다
		
		System.out.println(data1+"\n"+data2+"\n"+data3+"\n"+data4);
	}
}
