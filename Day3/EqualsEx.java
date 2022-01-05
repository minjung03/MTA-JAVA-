package Day3;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b) System.out.println("a==b"); // == 는 주소를 비교 (false)
		if(a.equals(b)) System.out.println("a is equal to b"); // .equals는 객체 내용이 같은지 비교 (true)
		if(a.equals(c)) System.out.println("a is equal to c"); // (false)
 	}
}
