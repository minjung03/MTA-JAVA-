package Day3;

// MTA ���� 4
public class Q06 {
	public static void main(String[] args) {
		
		double number = 27;
		
		number %= -3d; // number�� -3���� ���� �������� double�� �ֱ� => 0
		number += 10f; // number�� 10�� ���� float�� �ֱ� => 10.0
		number *= -4;  // number�� -4�� ���ϱ� => -40.0
		
		System.out.println(number);
	}
}
