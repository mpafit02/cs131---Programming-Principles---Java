public class BouncingBall {
	public static void main(String[] args) {
		double rx = .480, ry = .860;	//position
		double vx = .015, vy = .023;	//velocity
		double radius = .05;			//radius
		StdDraw.setXscale(-1.0, +1.0);	//rescale cordinates
		StdDraw.setYscale(-1.0, +1.0);
		while (true) {
			if (Math.abs(rx + vx) > 1.0)	//bounce
				vx = -vx;
			if (Math.abs(ry + vy) > 1.0)
				vy = -vy;

			rx = rx + vx;
			ry = ry + vy;

			StdDraw.clear(StdDraw.ORANGE);	//clear background
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(rx, ry, radius);	//draw the ball
			StdDraw.show(30);
		}
	}
}