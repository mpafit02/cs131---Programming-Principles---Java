
public class Askisi1 {
	public static double sum(int n) // n>=1
	{
		if (n == 1)
			return 1;
		return 1 / (double) n + sum(n - 1);
	}

	public static void main(String[] args) {
		int n = StdIn.readInt();
		double sum = sum(n);
		System.out.println(sum);
	}

}
