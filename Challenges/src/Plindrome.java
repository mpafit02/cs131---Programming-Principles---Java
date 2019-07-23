
public class Plindrome {

	public static void main(String[] args) {
		long num = StdIn.readLong(), num2 = 0, num1 = num;
		int digit;
		while (num1 != 0) {
			digit = (int) (num1 % 10);
			num2 = (num2 * 10) + digit;
			num1 = num1 / 10;
		}
		if(num2 == num) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Is not Palindrome");
		}
	}

}
