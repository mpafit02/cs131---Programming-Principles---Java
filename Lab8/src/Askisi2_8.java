
public class Askisi2_8 {
	public static final int TABLE_SIZE = 10;
	public static void main(String[] args) {
		int table[] = new int[TABLE_SIZE];
		for(int i = 0; i < table.length; i++) {
			table[i] = (int)(Math.random() * 101); // 0 - 100
			System.out.print(table[i] + " ");
		}
	}

}
