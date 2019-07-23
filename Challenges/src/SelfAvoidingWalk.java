public class SelfAvoidingWalk {
	// Including new public static methods in class SelfAvoidingWalk
	public static void putchar(char c) {
		System.out.print(c);
	}

	public static void newL() {
		putchar('\n');
	}

	public static void draw_line(char c, int len) {
		for (int i = 0; i < len; i++)
			putchar(c);
	}

	// array a gives the grid with the walk, x and y are the coordinates of
	// the final position
	public static void display_walk(boolean[][] a, int x, int y) {
		newL();
		putchar('+');
		draw_line('-', a[0].length);
		putchar('+');
		for (int i = 0; i < a[0].length; i++) {
			newL();
			putchar('|');
			for (int j = 0; j < a[0].length; j++)
				if (a[i][j]) {
					if (i == a[0].length / 2 && j == i)
						putchar('O');
					else if (i == x && j == y)
						putchar('F');
					else
						putchar('+');
				} else
					putchar(' ');
			putchar('|');
		}
		newL();
		putchar('+');
		draw_line('-', a[0].length);
		putchar('+');
		newL();
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); // grid size
		int T = Integer.parseInt(args[1]); // number of trials
		int deadEnds = 0; // trials resulting in dead end
		for (int t = 0; t < T; t++) {
			boolean[][] a = new boolean[N][N]; // intersections visited
			int x = N / 2, y = N / 2; // current position
			while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
				if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
					deadEnds++;
					break;
				}
				a[x][y] = true; // mark as visited
				double r = Math.random();
				if (r < 0.25) {
					if (!a[x + 1][y])
						x++;
				} else if (r < 0.50) {
					if (!a[x - 1][y])
						x--;
				} else if (r < 0.75) {
					if (!a[x][y + 1])
						y++;
				} else if (r < 1.00) {
					if (!a[x][y - 1])
						y--;
				}
			}
			display_walk(a,x,y);
		}
		System.out.println(100 * deadEnds / T + "% dead ends");
	}
}