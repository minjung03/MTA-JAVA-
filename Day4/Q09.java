package Day4;

// MTA ���� 9
public class Q09 {

	boolean isPreserved = false;
	private boolean isCreared = false;
	
	void preserve() {
		isPreserved = true;
	}
	
	public static void main(String[] args) {
		
		Q09 ex = new Q09();
		ex.isCreared = true;  // static ������ �ƴϹǷ� ��ü. ���� ȣ��
		ex.preserve();        // static �޼��尡 �ƴϹǷ� ��ü. ���� ȣ��
		
		System.out.println(ex.isCreared);
		System.out.println(ex.isPreserved);
	}
}
