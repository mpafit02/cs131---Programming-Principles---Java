
public class Caps {

	public static void main(String[] args) {
		char c;
		while(!StdIn.isEmpty()) {
			c = StdIn.readChar();
			if (c >= 'a' && c <= 'z') {
				c = (char) (c - ('a' - 'A'));
			}
			System.out.print(c);
		}
	}

}
