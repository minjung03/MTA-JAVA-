package Day3;

// Q09 (+ EqualsEx.java)
public class Point {

	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
