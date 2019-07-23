//import java.awt.Color;

public class DrawRoses {

	public static void main(String[] args) {
		double N = StdIn.readInt();
		double r, x, y;
		//int R = 0, G = 0, B = 0;
		StdDraw.setCanvasSize(1000,1000);
		StdDraw.setPenColor(StdDraw.RED);
		for (int j = 0; j < N; j++) {
			for (double i = 0; i <= 2 * Math.PI; i += 0.002) {
				/*R = (int) (Math.random() * 256);
				G = (int) (Math.random() * 256);
				B = (int) (Math.random() * 256);
				Color randomColor = new Color(R, G, B);
				StdDraw.setPenColor(randomColor);*/
				r = Math.sin(N * i);
				x = r * Math.cos(i);
				y = r * Math.sin(i);
				StdDraw.setPenRadius(0.015);
				StdDraw.point(x/2 + 0.5, y/2 + 0.5);
			}
		}
	}

}
