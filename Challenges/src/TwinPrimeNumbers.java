
public class TwinPrimeNumbers {

	public static void main(String[] args) {
		int a;
		int b = 3;
		for (int i = b + 1; i < 100; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				a = b;
				b = i;
				System.out.println("(" + a + "," + b + ")");
			}
		}

		System.out.println();
		a = 0;
		b = 3;
		for (int i = b + 1; i < 100; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				a = b;
				b = i;
				if (b - a == 2) {
					System.out.println("(" + a + "," + b + ")");
				}
			}
		}
	}

}
