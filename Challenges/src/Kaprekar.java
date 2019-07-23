
public class Kaprekar {

	public static void main(String[] args) {
		int pow;
		int num;
		int len;
		for (int i = 1; i <= 100; i++) {
			len = 1;
			pow = (int) (Math.pow(i, 2));
			num = pow;
			while (pow > 0) {
				pow /= 10;
				len++;
			}
			len /= 2;
			if (i == num % ((int) Math.pow(10, len)) + num / ((int) Math.pow(10, len))) {
				System.out.print(i + " " + num / ((int) Math.pow(10, len)) + " " + num % ((int) Math.pow(10, len)) + "\n");
			}
		}
	}

}
