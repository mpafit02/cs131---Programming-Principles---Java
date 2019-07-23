
public class Fstatistics {

	public static void printChar(char c, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(c);
		}
	}

	public static void main(String args[]) {
		int day = 1;
		int maxMD = 1, maxWD = 1, maxCD = 1, maxTD = 1;
		int maxMen = 0;
		int maxWmen = 0;
		int maxChild = 0;
		int maxTotal = 0;
		while (!StdIn.isEmpty()) {
			int men = StdIn.readInt();
			int wmen = StdIn.readInt();
			int child = StdIn.readInt();
			int sum = men + wmen + child;
			System.out.print("\n" + day + " ");
			printChar('M', (men+5)/10);
			System.out.print("\n" + day + " ");
			printChar('W', (wmen+5)/10);
			System.out.print("\n" + day + " ");
			printChar('C', (child + 5)/10);
			System.out.print("\n" + day + " ");
			printChar('T', (sum + 5)/10);
			if (men > maxMen) {
				maxMen = men;
				maxMD = day;
			}
			if (wmen > maxWmen) {
				maxWmen = wmen;
				maxWD = day;
			}
			if (child > maxChild) {
				maxChild = child;
				maxCD = day;
			}
			if (sum > maxTotal) {
				maxTotal = sum;
				maxTD = day;
			}
			day++;
		}
		System.out.println();
		System.out.println("Max no of men was " + maxMen + " on day " + maxMD);
		System.out.println("Max no of women was " + maxWmen + " on day " + maxWD);
		System.out.println("Max no of children was " + maxChild + " on day " + maxCD);
		System.out.println("Max no of total passengers was " + maxTotal + " on day " + maxTD);

	}
}
