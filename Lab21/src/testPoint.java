
public class testPoint {

	public static void main(String[] args) {
		Point[] table = new Point[10];
		for (int i = 0; i < table.length; i++) {
			table[i] = new Point((int)(Math.random() * 10), (int)(Math.random() * 10));
			System.out.println(table[i]);
		}
		PointLib.sort(table, true);
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
		
		PointLib.sort(table, false);
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
	}

}
