package Day2;

// 예외 처리 - 배열의 인덱스가 범위를 벗어날 때 발생하는 ArrayIndexOutOfBoundsException
public class Q06 {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1] = i+1+intArray[i];
				// i가 4일 때 intArray[5]가 되면서 범위를 벗어나는 오류 발생
				System.out.println("intArray["+i+"] = "+intArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다");
		}
	}

}
