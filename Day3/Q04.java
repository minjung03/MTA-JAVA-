package Day3;

// MTA ±‚√‚ 2
public class Q04 {
	
	public static boolean duplicate(int[] array) {		
		boolean isDuplicate = false;
		
		for(int x = 0; x < array.length-1; x++) {
			for(int y = x+1; y<array.length; y++) {
				
				if(array[x]==array[y]) {
					isDuplicate = true;
					if(isDuplicate) {
						break;
					}
				}
				System.out.println(array[y]);
			}
		}
		System.out.println(isDuplicate);
		return isDuplicate;
	}
	
	public static void main(String[] args) {
		int array[] = {0,0,1};
		System.out.println(duplicate(array));
	}
}
