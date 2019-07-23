
public class PrintHello {
	public static void pChr(char chr) {
		System.out.print(chr);
	}

	public static void pLine(char chr, int times) {
		for (int i = 0; i < times; i++) {
			pChr(chr);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pLine('*', 8);
				pLine(' ', 3);
				pChr('*');
				pLine(' ', 8);
				pChr('*');
				pLine(' ', 7);
				pChr(' ');
				pLine('*', 4);
				pLine(' ', 4);
				pChr('|');
				break;
			case 1:
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pChr('*');
				pLine(' ', 7);
				pLine(' ', 3);
				pChr('*');
				pLine(' ', 8);
				pChr('*');
				pLine(' ', 7);
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pChr('|');
				break;
			case 2:
				pLine('*', 6);
				pLine(' ', 3);
				pLine('*', 5);
				pLine(' ', 6);
				pChr('*');
				pLine(' ', 8);
				pChr('*');
				pLine(' ', 7);
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pChr('|');
				break;
			case 3:
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pChr('*');
				pLine(' ', 7);
				pLine(' ', 3);;
				pChr('*');
				pLine(' ', 8);
				pChr('*');
				pLine(' ', 7);
				pChr('*');
				pLine(' ', 4);
				pChr('*');;
				pLine(' ', 3);
				pChr('|');
				break;
			case 4:
				pChr('*');
				pLine(' ', 4);
				pChr('*');
				pLine(' ', 3);
				pLine('*', 8);
				pLine(' ', 3);
				pLine('*', 5);
				pLine(' ', 4);
				pLine('*', 5);
				pLine(' ', 3);
				pChr(' ');
				pLine('*', 4);
				pLine(' ', 4);
				pChr('o');
				break;
			}
			pChr('\n');
		}
	}
}
