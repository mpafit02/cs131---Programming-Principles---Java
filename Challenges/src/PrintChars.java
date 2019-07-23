
public class PrintChars {

	public static void main(String[] args) {
		char start = StdIn.readChar();
		char end = StdIn.readChar();
		int count = 1;
		for (char c = start; c <= end; c++) {
			System.out.print(c + " ");
			count++;
			if (count == 20) {
				System.out.println();
				count = 1;
			}
		}
	}

}
