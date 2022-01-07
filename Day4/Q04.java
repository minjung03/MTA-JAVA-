package Day4;

// MTA ±‚√‚ 4
public class Q04 {

	public static void main(String[] args) {
		String[][] arr = {
				{"1", "2", "3"},
				{"4", "5", "6"}
		};
		traverse(arr);
	}
	
	public static void traverse(String[][] board) {
		for(int x=0; x<board.length; x++) 
			for(int y=0; y<board[x].length; y++)
				System.out.println(board[x][y]);
	}
	
}
