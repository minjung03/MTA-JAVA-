package Day4;

// MTA ±‚√‚ 2
public class Q02 {

	public static void main(String[] args) {
		String numberAsString = "123";
		convertStringToNumber(numberAsString);		
	}
	
	public static void convertStringToNumber(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}

}