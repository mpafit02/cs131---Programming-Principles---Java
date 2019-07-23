
public class Fibonacci {

	public static long Fib(int x) {
		return Fib(x, 0, 1);
	}

	public static long Fib(int x, long a, long b) {
		if (x == 0) {
			return a;
		} else {
			System.out.print(a + " ");
			return Fib(x - 1, b, a + b);
		}
	}

	public static void main(String[] args) {
		int x = 10;
		long num = Fib(x);
		System.out.print(num);
	}

}
