
public class NumberOfDigits {
	public static int sum(int n) {
		if ((n < 10)&&(n > -10)) {
			return 1;
		}
		return 1 + sum(n / 10);
	}

	public static void main(String[] args) {
		int n = StdIn.readInt();
		int sum = sum(n);
		System.out.println(sum);
	}

}
