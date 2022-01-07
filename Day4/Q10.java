package Day4;

// MTA 기출 10 (예외 문제는 꼭 나오니 예외 종류 꼭 확인!)
public class Q10 {

	public static void main(String[] args) {
		
		try {
			int x = 1/0; // 정수를 0으로 나누어 ArithmeticException 예외 발생
			// 예외가 발생하므로 try 구문은 실행되지 않는다
			System.out.println("try");
		}
		catch(ArithmeticException ex) { // ArithmeticException 발생
			System.out.println("catch ArithmeticException");
		}
		catch(Exception ex) { // 위에서 에러를 전부 잡아 Exception catch문은 오지 않는다
			System.out.println("catch Exception");
		}
		finally { // finally 구문은 예외 발생 여부 상관없이 실행된다
			System.out.println("finally");
		}
		
		
		/* 
		- Exception도 상속 관계가 존재한다
		  
		catch(Exception ex) { }
		catch(ArithmeticException ex) { }
		
		위와 같이 작성하면 오류가 발생한다.
		예외 처리의 최상위 클래스 Exception이 맨 위 catch문에 있다면 
		다음 catch로 가지 못하고 전부 잡아버리니 오류가 발생하는 것!
		
		범위가 '작은 것부터' 쓰는 것이 올바른 방법이다
		
		*/

	}

}
