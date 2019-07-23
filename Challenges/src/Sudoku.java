
public class Sudoku {

	// Draw Array
	public static void printArray(int[][] arr) {
		int c = 0;
		int r = 1;
		for (int i = 0; i < 41; i++) {
			System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (c == 0) {
					System.out.print("|| ");
				} else {
					System.out.print("| ");
				}
				System.out.print(arr[i][j] + " ");
				c++;
				if (c == 3) {
					c = 0;
				}
			}
			System.out.println("||");
			for (int k = 0; k < 41; k++) {
				if (r == 0) {
					System.out.print("=");
				} else {
					System.out.print("-");
				}
			}

			System.out.println();
			r++;
			if (r == 3) {
				r = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 9 + 1);
			}
		}
		printArray(arr);
	}

}
