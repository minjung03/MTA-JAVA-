package Day3;

public class B extends A{

	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) { // 부코 클래스의 생성자를 명시하지 않았으므로 '기본' 생성자 호출
		System.out.println("매개변수 생성자 B");
	}
}

