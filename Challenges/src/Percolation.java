
public class Percolation {
	// return boolean matrix representing full sites
	public static boolean[][] flow(boolean[][] open) {
		int N = open.length;
		boolean[][] full = new boolean[N][N];
		for (int j = 0; j < N; j++)
			full[0][j] = open[0][j];
		for (int i = 1; i < N; i++)
			for (int j = 0; j < N; j++)
				full[i][j] = open[i][j] && full[i - 1][j];
		return full;
	}

	public static boolean percolates(boolean[][] open) {
		int N = open.length;
		boolean[][] full = flow(open);
		for (int j = 0; j < N; j++)
			if (full[N - 1][j])
				return true;
		return false;
	}

	public static boolean[][] random(int N, double p) {
		boolean[][] a = new boolean[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = StdRandom.bernoulli(p);
		return a;
	}

	// test client
	public static void main(String[] args) {
		boolean[][] open = StdArrayIO.readBoolean2D();
		StdArrayIO.print(flow(open));
		StdOut.println(percolates(open));
	}

	// plot matrix to standard drawing
	public static void show(boolean[][] a, boolean foreground) {
	}
}