
public class WCount {
	public static boolean white_space (char c) {
		 return c == ' ' || c == '\n' || c == '\t';
		}

	public static void main(String[] args) {
		char c;
		int chars = 0;
		int words = 0;
		int lines = 0;
		while(!StdIn.isEmpty()) {
			c = StdIn.readChar();
			chars++;
			if(white_space(c)) {
				words++;
			}
			if(c == '\n') {
				lines++;
			}
		}
		 System.out.printf("chars = %d, words = %d, lines = %d", chars, words, lines);
			
	}

}
