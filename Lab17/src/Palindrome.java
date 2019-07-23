
public class Palindrome {

	public static boolean pal(int front, int end, String s) {
		if (end == 1) {
			return true;
		}else if (s.charAt(front) == s.charAt(end - 1)) {
			return true && pal(++front, --end, s);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = StdIn.readString();
		int front = 0;
		int end = s.length();
		if (pal(front, end, s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
