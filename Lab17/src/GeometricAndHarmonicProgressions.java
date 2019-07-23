
public class GeometricAndHarmonicProgressions {
	public static double sum1(int n) // n>=1
	{
		if (n == 1)
			return 1;
		return (1 / (double) n) * sum1(n - 1);
	}
	public static double sum2(int n) // n>=1
	{
		if (n == 1)
			return 1;
		return n * sum2(n - 1);
	}
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		double sum = sum1(n) + sum2(n);
		System.out.println(sum);
	}

}
