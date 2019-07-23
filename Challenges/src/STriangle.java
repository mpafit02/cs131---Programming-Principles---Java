public class STriangle {

	public static void draw(int n, double[] x, double[] y) {
		if (n == 0) {
			StdDraw.line(x[0], y[0], x[1], y[1]);
			StdDraw.line(x[0], y[0], x[2], y[2]);
			StdDraw.line(x[1], y[1], x[2], y[2]);
			return;
		}
		double[] a = new double[3];
		double[] b = new double[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[j] = (x[i] + x[j]) / 2;
				b[j] = (y[i] + y[j]) / 2;
			}
			draw(n - 1, a, b);
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double[] x = { 0.0, 1.0, 0.5 };
		double[] y = { 0.0, 0.0, 0.866 };
		draw(n, x, y);
	}

}
