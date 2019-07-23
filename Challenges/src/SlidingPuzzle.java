
public class SlidingPuzzle {

	public static void Display(char[] Blocks) {
		for (int i = 0; i < Blocks.length; i++) {
			System.out.println("+-");
		}
		System.out.println("+");
		for (int i = 0; i < Blocks.length; i++) {
			System.out.println("|" + Blocks[i]);
		}
		System.out.println("+");
		for (int i = 0; i < Blocks.length; i++) {
			System.out.println("+-");
		}
	}

	public static int DetectEmpty(char[] Blocks) {
		int pos = 0;
		for (int i = 0; i < Blocks.length; i++) {
			if (Blocks[i] == 'E') {
				pos = i;
			}
		}
		return pos;
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
		char Blocks2[] = new char[Blocks.length];
		int empty = DetectEmpty(Blocks);
		if (empty > 1) {
			swap(Blocks2, empty, empty - 2);
			Display(Blocks2);
			System.out.println("The cost of the above move is 1");
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
