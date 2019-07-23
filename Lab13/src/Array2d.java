
public class Array2d {

	public static void main(String[] args) {
		int n = StdIn.readInt();
		int[][] arr = new int[n][n];
		int k = StdIn.readInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i <= n - k; i++) {
			for(int j = 0; j <= n - k; j++) {
				int sum = 0;
				for(int m = i; m < i + k; m++) {
					for(int l = j; l < j + k; l++) {
						sum += arr[m][l];
					}
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

}
