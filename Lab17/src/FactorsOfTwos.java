
public class FactorsOfTwos {
	public static int twos(int num) {
		if (num % 2 != 0 || num == 0) {
			return 0;
		} else {
			return 1 + twos(num / 2);
		}
	}

	public static void main(String[] args) {
		int num = StdIn.readInt();
		System.out.println(twos(num));
	}

}
