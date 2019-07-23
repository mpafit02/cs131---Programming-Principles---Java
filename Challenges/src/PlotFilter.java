public class PlotFilter {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1000,1000);
		double xmin = StdIn.readDouble();
		double ymin = StdIn.readDouble();
		double xmax = StdIn.readDouble();
		double ymax = StdIn.readDouble();
		StdDraw.setXscale(xmin, xmax);
		StdDraw.setYscale(ymin, ymax);
		while (!StdIn.isEmpty()) {
			double x = StdIn.readDouble();
			double y = StdIn.readDouble();
			StdDraw.point(x, y);
		}
	}
}