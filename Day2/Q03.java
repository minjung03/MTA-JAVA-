package Day2;

//for-each�� ���� 3����
public class Q03 {

	enum Week { // ����� ���� Ÿ��
		��,ȭ,��,��,��,��,��
	}
	
	public static void main(String[] args) {
		
		// 1. int�� �迭
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num) {
			sum += k;
		}
		System.out.println("���� "+sum);
		
		
		// 2. String�� �迭
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		for(String s : names) {
			System.out.println(s+" ");
		}
		
		// 3. ����� ���� Ÿ�� ( enum _ {} )
		for(Week day : Week.values()) {
			System.out.print(day+"���� ");
		}
		
	}

}
