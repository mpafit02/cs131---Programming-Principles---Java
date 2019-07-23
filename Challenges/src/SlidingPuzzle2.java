import org.omg.Messaging.SyncScopeHelper;

public class SlidingPuzzle2 {

	public static void Display(char[] Blocks) {
		String s = "";
		for (int i = 0; i < Blocks.length; i++) {
			s += "+-";
		}
		s += "+\n";
		for (int i = 0; i < Blocks.length; i++) {
			s += "|" + Blocks[i];
		}
		s += "|\n";
		for (int i = 0; i < Blocks.length; i++) {
			s += "+-";
		}
		s += "+\n";
		System.out.println(s);
	}

	public static int DetectEmpty(char[] Blocks) {
		for (int i = 0; i < Blocks.length; i++) {
			if (Blocks[i] == 'E') {
				return i;
			}
		}
		return 0;
	}

	public static void Copy(char[] table1, char[] table2) {
		for (int i = 0; i < table1.length; i++) {
			table2[i] = table1[i];
		}
	}

	public static void swap(char[] Blocks, int i, int j) {
		char temp = Blocks[i];
		Blocks[i] = Blocks[j];
		Blocks[j] = temp;
	}

	public static void Moves(char[] Blocks) {
		int pos = DetectEmpty(Blocks);
		char Blocks2[] = new char[Blocks.length];
		for (int i = 1; i <= 3; i++) {
			Copy(Blocks, Blocks2);
			if (pos - i >= 0) {
				swap(Blocks2, pos, pos - i);
				Display(Blocks2);
			}
		}
		for (int i = 1; i <= 3; i++) {
			Copy(Blocks, Blocks2);
			if (pos + 1 <= Blocks.length) {
				swap(Blocks2, pos, pos + i);
				Display(Blocks2);
			}
		}
	}

	public static void main(String[] args) {
		char[] Blocks = { 'B', 'W', 'E', 'W', 'B', 'B', 'W' };
		System.out.println();
		Display(Blocks);
		System.out.println();
		Moves(Blocks);
		System.out.println("\n\n");
	}

}
