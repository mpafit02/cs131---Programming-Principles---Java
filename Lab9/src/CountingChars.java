//import java.util.Scanner;
public class CountingChars {

	public static void main(String[] args) {
		//Scanner stdin = new Scanner(System.in);
		//String str = stdin.nextLine();
		char table[] = new char[26];
		int count[] = new int[26];
		int j = 0;
		for(char c = 'a'; c <= 'z'; c++) {
			table[j] = c;
			j++;
		}	
		char chr = StdIn.readChar();
		while(chr != '.') {
				if ((chr <= 'Z')&&(chr >= 'A')) {
					 chr += 32;
				}
				for(int k = 0 ; k < table.length; k++) {
					if (chr == table[k]) {
						count[k]++;
					}
				}
				chr = StdIn.readChar();
			}
		
		for(int i = 0 ; i < table.length; i++) {
			System.out.println(table[i] + " = " + count[i]);
		}
		
		//stdin.close();
	}

}
