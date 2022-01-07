package Day4;

// MTA 기출 9
public class Q09 {

	boolean isPreserved = false;
	private boolean isCreared = false;
	
	void preserve() {
		isPreserved = true;
	}
	
	public static void main(String[] args) {
		
		Q09 ex = new Q09();
		ex.isCreared = true;  // static 변수가 아니므로 객체. 으로 호출
		ex.preserve();        // static 메서드가 아니므로 객체. 으로 호출
		
		System.out.println(ex.isCreared);
		System.out.println(ex.isPreserved);
	}
}
