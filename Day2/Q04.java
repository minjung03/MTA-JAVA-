package Day2;

// **비정방형 배열 탐색하기
public class Q04 {
 
	public static void main(String[] args) {
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		
		for(int i=0; i< intArray.length; i++) {
			// 1. 전체 행(세로) 만큼 돌아가게 한다
			for(int j=0; j<intArray[i].length; j++) {
			// 2. intArray[i].length로 조건을 주어 각 행의 열(가로) 개수만큼 반복하게 한다**
				
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
