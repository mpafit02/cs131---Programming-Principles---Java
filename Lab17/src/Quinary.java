import java.util.Scanner;

public class Quinary {
	public static int quin(int n, int pow, int res) {
		int a = 0;
		a = n % 5;
		if(n % 5 == 0) {
			a = 10;
		}
		if (n == 1) {
			return res;
		}
		res += a * pow;
		pow *= 10;
		return quin(n / 5, pow, res);
	}

	public static void main(String[] args) {
		int n;
		int x = 0, pow = 1;
		int res = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any decimal number:");
		n = s.nextInt();
		x = quin(n, pow, res);
		System.out.println("Binary number:" + x);
		s.close();
	}
}