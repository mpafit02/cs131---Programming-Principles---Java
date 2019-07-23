
public class SquareXO {

	public static void main(String[] args) {
		double N = StdIn.readInt();
		StdDraw.setPenColor(StdDraw.BLACK);
		double x = 1 / (2 * N);
		double y = 1 / (2 * N);
		for (double i = 0; i < N; i++) {
			for (double j = 0; j < N; j++) {
				if ((j == 0) && (N % 2 == 0)) {
				} else {
					if (StdDraw.getPenColor() == StdDraw.BLACK) {
						StdDraw.setPenColor(StdDraw.RED);
					} else if (StdDraw.getPenColor() == StdDraw.RED) {
						StdDraw.setPenColor(StdDraw.BLACK);
					}
				}
				StdDraw.filledSquare(x, y, 1 / (2 * N));
				x += 1 / N;
				
			}
			x = 1 / (2 * N);
			y += 1 / N;

		}
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.square(0.5, 0.5, 0.5);
	}

}
