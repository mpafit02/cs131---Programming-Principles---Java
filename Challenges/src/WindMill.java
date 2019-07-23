
public class WindMill {

	public static void draw_line(int x, char c) {
		for(int i = 0; i < x; i++) {
			System.out.print(c + " ");
		}
	}
	public static void draw_line_triA(int size, int row, char fill) {
		draw_line(row, fill);
		draw_line(size - row, ' ');
	}

	public static void draw_line_triB(int size, int row, char fill) {
		draw_line(size - row, ' ');
		draw_line(row, fill);
	}

	public static void draw_line_triC(int size, int row, char fill) {
		draw_line(size - row + 1, fill);
		draw_line(row - 1, ' ');
	}

	public static void draw_line_triD(int size, int row, char fill) {
		draw_line(row - 1, ' ');
		draw_line(size - row + 1, fill);
	}

	public static void draw_bottomhalf_wm(int size, char fill) {
		int row = 1;
		while (row <= size) {
			System.out.println();
			draw_line_triB(size, row, fill);
			draw_line_triD(size, row, fill);
			row = row + 1;
		}
	}

	public static void draw_tophalf_wm(int size, char fill) {
		int row = 1;
		while (row <= size) {
			System.out.println();
			draw_line_triA(size, row, fill);
			draw_line_triC(size, row, fill);
			row = row + 1;
		}
	}

	public static void draw_windmill(int size, char fill) {
		draw_tophalf_wm(size, fill);
		draw_bottomhalf_wm(size, fill);
	}

	public static void main(String[] args) {
		draw_windmill(5,'*');
	}

}
