
public class SimmetricArray {
	public static void readArray(int array2D[][]) {
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[0].length; j++) {
				array2D[i][j] = StdIn.readInt();
			}
		}
	}
	public static boolean isArraySimmetric(int array2D[][]) {
		boolean isSimmetric = true;
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[0].length/2; j++) {
				if(array2D[i][j] != array2D[j][i]) {
					isSimmetric = false;
				}
			}
		}
		return isSimmetric;
	}
	public static void printArray(int array2D[][]) {
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[0].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int x,y;
		System.out.print("Dose tin proti diastasi: ");
		x = StdIn.readInt();
		System.out.print("Dose tin defteri diastasi: ");
		y = StdIn.readInt();
		if(x == y) {
			int arr2D[][] = new int[x][y];
			readArray(arr2D);
			if(isArraySimmetric(arr2D)) {
				System.out.println("O pinakas einai simmetrikos");
			}else {
				System.out.println("O pinakas den einai simmetrikos");
			}
			printArray(arr2D);
		}else {
			System.out.println("I proti diastasi den isoute e tin defteri ara den einai simmetrikos");
		}

	}

}
