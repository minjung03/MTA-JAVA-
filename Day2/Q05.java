package Day2;

public class Q05 {

	static int[] makeArray() { // ������ �迭�� �����ϴ� �޼��� (��ȯ Ÿ�� �� ����*)
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i;
		
		return temp; //�迭 ����
	}
	
	
	public static void main(String[] args) {
	
		int intArray[]; // �迭 ���۷��� ���� ����
		intArray = makeArray(); // �޼���κ��� �迭�� ���� ����*
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" ");
			
	}
}
