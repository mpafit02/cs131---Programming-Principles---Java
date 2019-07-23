public class XmasFigs {
	public static void snowManRow(int row) {
		switch (row) {
		case 1:
			System.out.printf("     _______     ");
			break;
		case 2:
			System.out.printf("    /       \\      ");
			break;
		case 3:
			System.out.printf("    | x   x |      ");
			break;
		case 4:
			System.out.printf("    |   O   |      ");
			break;
		case 5:
			System.out.printf(" _| \\  ---  /  |_  ");
			break;
		case 6:
			System.out.printf("  \\  -------  /	");
			break;
		case 7:
			System.out.printf("   \\/       \\/     ");
			break;
		case 8:
			System.out.printf("    |   o   |      ");
			break;
		case 9:
			System.out.printf("    |       |      ");
			break;
		case 10:
			System.out.printf("    |   o   |      ");
			break;
		case 11:
			System.out.printf("    |       |      ");
			break;
		case 12:
			System.out.printf("    \\_______/      ");
			break;
		case 13:
			System.out.printf("  * MERRY XMAS *   ");
		}
	}

	public static void starRow(int row) {
		switch (row) {
		case 1:
			System.out.print("     *     ");
			break;
		case 2:
			System.out.print("    ***    ");
			break;
		case 3:
			System.out.print(" ********* ");
			break;
		case 4:
			System.out.print("  *******  ");
			break;
		case 5:
			System.out.print(" ********* ");
			break;
		case 6:
			System.out.print("    ***    ");
			break;
		case 7:
			System.out.print("     *     ");
		}
	}

	public static void xmasRow(int row) {
		switch (row) {
		case 1:
			System.out.print("           ");
			break;
		case 2:
			System.out.print("           ");
			break;
		case 3:
			System.out.print("   MERRY   ");
			break;
		case 4:
			System.out.print("  X M A S  ");
			break;
		case 5:
			System.out.print(" ********* ");
			break;
		case 6:
			System.out.print("           ");
			break;
		case 7:
			System.out.print("           ");
		}
	}

	public static void blankRow() {
		System.out.print("           ");
	}

	public static void main(String[] args) {
		int num = 6;
		num = (int)Math.round((double)num / 10);
		System.out.println(num);
		int choise = Integer.parseInt(args[0]);
		if (choise == 1) {
			int repeat = Integer.parseInt(args[1]);

			for (int i = 1; i <= 13; i++) {
				for (int j = 0; j < repeat; j++) {
					snowManRow(i);
				}
				System.out.println();
			}
		} else {
			while (!StdIn.isEmpty()) {
				int size = StdIn.readInt();
				boolean arr[][] = new boolean[size][size];
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						arr[i][j] = StdIn.readBoolean();
					}
				}
				for (int i = 0; i < size; i++) {
					for (int k = 1; k <= 7; k++) {
						for (int m = 0; m < size; m++) {
							if (i == size / 2 && m == size / 2) {
								xmasRow(k);
							} else if (arr[i][m]) {
								starRow(k);
							} else {
								blankRow();
							}
						}
						System.out.println();
					}
				}
			}

		}
	}
}
