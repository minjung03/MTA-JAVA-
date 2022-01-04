package Day1;

// MTA 기출 3
public class Q6 {
	// 파일 실행 : 파일 우클릭 -> Rus As -> Run Conif.. -> Argument 입력 -> Run

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			handleArgument(args[i]);
			
		}
	}

	private static void handleArgument(String string) {
		System.out.println(string);
	}
}
