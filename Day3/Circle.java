package Day3;

public class Circle extends Shape{

	protected String name;
	
	public void draw() {
		name = "Circle";
		super.name = "Shape"; // �θ� Ŭ���� name�� �� �ֱ�
		super.draw(); //  �θ� Ŭ������ draw() �Լ� ȣ��
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
	}
}
