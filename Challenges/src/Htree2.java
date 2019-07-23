
public class Htree2 {
	public static void draw(int n, double sz, double x, double y) {
		StdDraw.line(x - sz / 2, y, x + sz / 2, y);
		StdDraw.line(x - sz / 2, y - sz / 2, x - sz / 2, y + sz / 2);
		StdDraw.line(x + sz / 2, y - sz / 2, x + sz / 2, y + sz / 2);
		if (n != 0) {
			draw(n - 1, sz/2, x - sz/2, y + sz/2);
			draw(n - 1, sz/2, x - sz/2, y - sz/2);
			draw(n - 1, sz/2, x + sz/2, y + sz/2);
			draw(n - 1, sz/2, x + sz/2, y - sz/2);
		}
	}

	public static void main(String[] args) {
		StdDraw.setCanvasSize(1000,1000);
		int n = StdIn.readInt();
		draw(n, .5, .5, .5);

	}

}
