package Day1;

// MTA ���� 5 (����� �ſ� ����)
public class Q08 {
	
	public static void main(String[] args) {
		int anum = 55;
		
		for(int cnt = 0; cnt < 10; cnt++) {
			add(anum);
		}
		System.out.println(anum); // "55" �Ʒ��� anum���� "�ٸ�" �����̴�
								  // ������ anum���� �ƹ��� ��ȭ�� ���� 
		
		// System.out.println(cnt); - ���� ��� ����*
	}
	public static void add(int anum) {
		anum++; // ���� anum���� "�ٸ�" �����̴�. (�� anum�� �Ű�����)
		System.out.println(anum); // "56" : �Ź� ���Ӱ� 55�� �޾� ������Ű�� 56�� �ݺ������� ��µȴ�
	}
}

