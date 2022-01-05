package Day3;

public class Circle extends Shape{

	protected String name;
	
	public void draw() {
		name = "Circle";
		super.name = "Shape"; // 부모 클래스 name에 값 넣기
		super.draw(); //  부모 클래스의 draw() 함수 호출
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
	}
}
