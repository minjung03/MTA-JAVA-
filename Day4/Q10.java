package Day4;

// MTA ���� 10 (���� ������ �� ������ ���� ���� �� Ȯ��!)
public class Q10 {

	public static void main(String[] args) {
		
		try {
			int x = 1/0; // ������ 0���� ������ ArithmeticException ���� �߻�
			// ���ܰ� �߻��ϹǷ� try ������ ������� �ʴ´�
			System.out.println("try");
		}
		catch(ArithmeticException ex) { // ArithmeticException �߻�
			System.out.println("catch ArithmeticException");
		}
		catch(Exception ex) { // ������ ������ ���� ��� Exception catch���� ���� �ʴ´�
			System.out.println("catch Exception");
		}
		finally { // finally ������ ���� �߻� ���� ������� ����ȴ�
			System.out.println("finally");
		}
		
		
		/* 
		- Exception�� ��� ���谡 �����Ѵ�
		  
		catch(Exception ex) { }
		catch(ArithmeticException ex) { }
		
		���� ���� �ۼ��ϸ� ������ �߻��Ѵ�.
		���� ó���� �ֻ��� Ŭ���� Exception�� �� �� catch���� �ִٸ� 
		���� catch�� ���� ���ϰ� ���� ��ƹ����� ������ �߻��ϴ� ��!
		
		������ '���� �ͺ���' ���� ���� �ùٸ� ����̴�
		
		*/

	}

}
