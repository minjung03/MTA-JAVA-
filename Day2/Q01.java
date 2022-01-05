package Day2;

//저번에 나왔었다. 예제 알아두기!
public class Q01 {

	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c+1);
		}while(c<='z');

	}
}
