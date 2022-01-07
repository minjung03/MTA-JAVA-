package Day4;

//MTA ±âÃâ 13
public class Q13 {

	public static void main(String[] args) {
		System.out.println(safeRoot(-1, 2));

	}
	
	public static double safeRoot(double radicand, double index) {
		if(radicand >= 0) {
			return Math.pow(radicand, 1/index);
		}
		else {
			if(index%2 == 0) {
				return -1;
			}
			else {
				return Math.pow(-radicand, 1/index);
			}
		}
	}

}
