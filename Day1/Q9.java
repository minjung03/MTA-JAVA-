package Day1;
// MTA ���� 6
public class Q9 {

	public static void main(String[] args) {
		printInt();
	}
	
	public static void printInt() {
		if(true) {
			int num = 1; // if �� �ȿ��� ����Ǿ����� �� �ȿ����� ������
			if(num>0) {
				num++;
			}
		}
		
		int num = 1; 
		addOne(num); // ���� ����
		num = num - 1;
		System.out.println(num); // 0
	}
	
	public static void addOne(int num) {
		num = num+1; // ���� num���� �ٸ� �����̴�
	}

}
