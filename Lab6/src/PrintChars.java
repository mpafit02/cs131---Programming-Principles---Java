
public class PrintChars {
	public static void newLine() {
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		char StartChar = ' ';
		char EndChar = '~';
		int perLine = 19;
		System.out.print("-----------------------------------------------------Print Characters with Codes----------------------------------------------------");
		for(char c = StartChar; c <= EndChar; c++) {
			if((c - StartChar)% perLine == 0) {
				newLine();
			}
			System.out.printf(" %s:%3d ",c,(int)c);
		}
		newLine();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");	
	}

}
