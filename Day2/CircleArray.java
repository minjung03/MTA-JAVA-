package Day2;

public class CircleArray {

	public static void main(String[] args) {
		Circle2[] c;
		c = new Circle2[5];
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle2(i); // 여기 부분 많이 틀린다**
		
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+" ");
		
	}
}
