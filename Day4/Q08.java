package Day4;

// MTA ���� 8
public class Q08 {
	public static void main(String[] args) {
		
		int timer = 60;
		
		while(timer >= 0) { // 0���� ũ�ų� ���� ������
			if(timer == 0) break; // Ÿ�̸Ӱ� 0�̵Ǹ� ����
			else {
				System.out.println("Ÿ�̸Ӱ� ī��Ʈ �ٿ� ���Դϴ�.."+ timer);
				timer--; // 0�� �� ������ Ÿ�̸� ����
			}
		}
	}
}
