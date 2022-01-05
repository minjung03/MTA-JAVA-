package Day2;

// MTA 기출 1 (Q7)
public class JavaProgram1 {
	
	int x = 25;
	
	public static void main(String[] args) {
		
		JavaProgram1 app = new JavaProgram1(); // 생성자 호출 (1 출력)
		{ int x = 5; }
		{ int x = 10;}
		
		int x = 100;
		System.out.println(x); // 같은 블럭 안 x를 가르킴 (100 출력)
		System.out.println(app.x); // app의 멤버변수 x를 가르킴 (25 출력)
	}
	
	public JavaProgram1() {
		int x = 1;
		System.out.println(x);
	}

}
