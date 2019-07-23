public class Visualize {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		boolean[][] open = Percolation.random(N, p);
		boolean[][] full = Percolation.flow(open);
		StdDraw.setPenColor(StdDraw.BLACK);
		Percolation.show(open, false);
		StdDraw.setPenColor(StdDraw.CYAN);
		Percolation.show(full, true);
	}
}