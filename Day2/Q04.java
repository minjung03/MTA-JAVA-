package Day2;

// **�������� �迭 Ž���ϱ�
public class Q04 {
 
	public static void main(String[] args) {
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		
		for(int i=0; i< intArray.length; i++) {
			// 1. ��ü ��(����) ��ŭ ���ư��� �Ѵ�
			for(int j=0; j<intArray[i].length; j++) {
			// 2. intArray[i].length�� ������ �־� �� ���� ��(����) ������ŭ �ݺ��ϰ� �Ѵ�**
				
				intArray[i][j] = (i+1)*10+j;
			}
		}
		
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
