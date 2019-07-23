
public class JavaPrint {

	public static void printChr(char c, int line) {
		for(int i = 0; i < line; i++) {
			System.out.print(c);
		}
	}
	public static void main(String[] args) {
		printChr(' ', 3);
		printChr('J', 1);
		printChr(' ', 4);
		printChr('A', 1);
		printChr(' ', 3);
		printChr('V', 1);
		printChr(' ', 5);
		printChr('V', 1);
		printChr(' ', 3);
		printChr('A', 1);
		printChr('\n', 1);
		
		printChr(' ', 3);
		printChr('J', 1);
		printChr(' ', 3);
		printChr('A', 1);
		printChr(' ', 1);
		printChr('A', 1);
		printChr(' ', 3);
		printChr('V', 1);
		printChr(' ', 3);
		printChr('V', 1);
		printChr(' ', 3);
		printChr('A', 1);
		printChr(' ', 1);
		printChr('A', 1);
		printChr('\n', 1);

		printChr('J', 1);
		printChr(' ', 2);
		printChr('J', 1);
		printChr(' ', 2);
		printChr('A', 5);
		printChr(' ', 3);
		printChr('V', 1);
		printChr(' ', 1);
		printChr('V', 1);
		printChr(' ', 3);
		printChr('A', 5);
		printChr('\n', 1);
		
		printChr(' ', 1);
		printChr('J', 2);
		printChr(' ', 2);
		printChr('A', 1);
		printChr(' ', 5);
		printChr('A', 1);
		printChr(' ', 3);
		printChr('V', 1);
		printChr(' ', 3);
		printChr('A', 1);
		printChr(' ', 5);
		printChr('A', 1);
		printChr('\n', 1);
	}

}
