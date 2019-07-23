
public class DerangementProblemA {

	public static void main(String[] args) {
		System.out.print("Dose arithmo foititon: ");
		int N = StdIn.readInt();
		boolean diataraxi = true;
		int arr[] = new int[N];
		while (!StdIn.isEmpty()) {
			diataraxi = true;
			for (int i = 0; i < N; i++) {
				arr[i] = StdIn.readInt();
				if (arr[i] == i + 1) {
					diataraxi = false;
				}
			}
			if(diataraxi)
				System.out.println("Yparxei diataraxi.");
			else
				System.out.println("Den yparxei diataraxi.");
		}
	}

}
