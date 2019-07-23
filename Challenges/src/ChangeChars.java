
public class ChangeChars {

	public static void main(String[] args) {
		char c = StdIn.readChar();
		if(c < 'a') {
			System.out.println((char)(c + ('a' - 'A')));
		}else {
			System.out.println(c);
		}
	}

}
