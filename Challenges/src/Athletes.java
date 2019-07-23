public class Athletes {
	public static final int NUM_ATHLETES = 10;

	public static void swap(int[][] athlete, int pos1, int pos2) {
		for (int j = 0; j < 4; j++) {
			int temp = athlete[pos1][j];
			athlete[pos1][j] = athlete[pos2][j];
			athlete[pos2][j] = temp;
		}
	}

	public static int min_pos(int[][] Table, int start_row, int end_row, int col) {
		int min = Table[start_row][col], minpos = start_row;
		for (int i = start_row; i < end_row; i++) {
			if (Table[i][col] < min) {
				minpos = i;
				min = Table[i][col];
			}
		}
		return minpos;
	}

	public static void select_sort(int[][] Athletes, int col, int len) {
		for (int i = 0; i < 9; i++) {
			int min = min_pos(Athletes, i, len, col);
			swap(Athletes, i, min);
		}
	}

	public static void get_data(int[][] Athletes, int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 4; j++) {
				Athletes[i][j] = StdIn.readInt();
			}
		}
	}

	public static void display_data(int[][] Athletes, int row, int col) {
		for (int i = 0; i < row; i++) {
			System.out.print(Athletes[i][col] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] Athletes_Data = new int[NUM_ATHLETES][4];
		get_data(Athletes_Data, NUM_ATHLETES);
		for (int i = 1; i <= 3; i++) {
			select_sort(Athletes_Data, i, NUM_ATHLETES);
			display_data(Athletes_Data, NUM_ATHLETES, i);
		}
		System.out.println();
		System.out.println();
	}

}