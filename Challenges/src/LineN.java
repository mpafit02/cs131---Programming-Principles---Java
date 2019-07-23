
public class LineN {

	public static void main(String[] args) {
		char c;
		int num = 2;
		System.out.print("1: ");
		while (!StdIn.isEmpty()) {
			c = StdIn.readChar();
			if (c == '\n') {
				System.out.print(num + ": ");
				num++;
			} else {
				System.out.print(c);
			}
		}
	}

}
