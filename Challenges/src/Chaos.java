//Trigona
/*
public class Chaos {
	
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		double[] cx = { 0.000, 1.000, 0.500 };
		double[] cy = { 0.000, 0.000, 0.866 };
		double x = 0.0, y = 0.0;
		StdDraw.setCanvasSize(800,800);
		for (int t = 0; t < T; t++) {
			int r = (int) (Math.random() * 3);
			x = (x + cx[r]) / 2.0;
			y = (y + cy[r]) / 2.0;
			if (r == 0)
				StdDraw.setPenColor(StdDraw.RED);
			else if (r == 1)
				StdDraw.setPenColor(StdDraw.GREEN);
			else if (r == 2)
				StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.point(x, y);
		}
	}
}
*/
//Fteri
public class Chaos {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);

		double x = 0.0, y = 0.0;
		StdDraw.setPenColor(StdDraw.GREEN);
		for (int t = 0; t < T; t++) {
			double r = Math.random();
			if (r < 0.02) {
				x = .5;
				y = .27 * y;
			} else if (r < 0.17) {
				x = -.14 * x + .26 * y + .57;
				y = .25 * x + .22 * y - .04;
			} else if (r < 0.3) {
				x = .17 * x - .21 * y + .41;
				y = .22 * x + .18 * y + .09;
			} else if (r < 1.0) {
				x = .78 * x + .03 * y + .11;
				y = -.03 * x + .74 * y + .27;
			}
			StdDraw.point(x, y);
		}
	}
}