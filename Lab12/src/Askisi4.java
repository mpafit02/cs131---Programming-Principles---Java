
public class Askisi4 {

	public static void main(String[] args) {
		int[][] arr2d = new int[10][10];
		int maxRow, minCol, maxJ = 0;
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d.length; j++) {
				arr2d[i][j] = (i + 1) * j;
			}
		}
		for (int i = 0; i < arr2d.length; i++) {
			maxRow = arr2d[i][0];
			for (int j = 0; j < arr2d.length; j++) {
				if (arr2d[i][j] > maxRow) {
					maxRow = arr2d[i][j];
					maxJ = j;
					//System.out.println(maxRow);
				}
			}
			minCol = arr2d[i][maxJ];
			//System.out.println(minCol);
			for (int j = 0; j < arr2d.length; j++) {
				if (arr2d[j][maxJ] < minCol) {
					minCol = arr2d[j][maxJ];
					//System.out.println(minCol);
				}
			}
			if(minCol == maxRow) {
				System.out.println("Max Row (" + i + ") number - Min Column (" + maxJ + ") number: " + maxRow + "\n");
			}
		}

		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d.length; j++) {
				System.out.printf("%3d",arr2d[i][j]);
			}
			System.out.println();
		}
	}

}
