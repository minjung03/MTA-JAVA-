package Day2;

public class Q05 {

	static int[] makeArray() { // 정수형 배열을 리턴하는 메서드 (반환 타입 잘 적기*)
		int temp[] = new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i;
		
		return temp; //배열 리턴
	}
	
	
	public static void main(String[] args) {
	
		int intArray[]; // 배열 레퍼런스 변수 선언
		intArray = makeArray(); // 메서드로부터 배열을 전달 받음*
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" ");
			
	}
}
