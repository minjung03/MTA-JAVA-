package Day1;

// MTA ���� 3
public class Q6 {
	// ���� ���� : ���� ��Ŭ�� -> Rus As -> Run Conif.. -> Argument �Է� -> Run

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			handleArgument(args[i]);
			
		}
	}

	private static void handleArgument(String string) {
		System.out.println(string);
	}
}
