import java.awt.Color;

class Luminance {

	public static double lum(Color c) {
		int r = c.getRed();
		int g = c.getGreen();
		int b = c.getBlue();
		return .299 * r + .587 * g + .114 * b;
	}

	public static Color toGray(Color c) {
		int y = (int) Math.round(lum(c));
		Color gray = new Color(y, y, y);
		return gray;
	}

	public static boolean compatible(Color a, Color b) {
		return Math.abs(lum(a) - lum(b)) >= 128.0;
	}

}

public class Grayscale {

	public static void main(String[] args) {
		Picture pic = new Picture("//C:/Users/mario/Pictures/Wallpapers/14853335655888643d4ad275.21793074.jpg");
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				Color color = pic.get(i, j);
				Color gray = Luminance.toGray(color);
				pic.set(i, j, gray);
			}
		}
		pic.show();
	}
}