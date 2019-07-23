
public class PrintWithCommas {
	public static String printWithCommas(int n) {
		if (n % 1000 == 0) {
			return "";
		}
		if (n < 1000) {
			return printWithCommas(n / 1000) + (n % 1000);
		} else {
			return printWithCommas(n / 1000) + "," + n % 1000;
		}
	}

	public static void main(String[] args) {
		int n = StdIn.readInt();
		System.out.println(printWithCommas(n));
	}

}
