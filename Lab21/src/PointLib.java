
public class PointLib {
	public static void sort(Point[] p, boolean b) {
		Point temp;
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length - 1; j++) {
				if (b) {
					if (p[j].getX() < p[j + 1].getX()) {
						temp = p[j];
						p[j] = p[j + 1];
						p[j + 1] = temp;
					}
				} else {
					if (p[j].getY() < p[j + 1].getY()) {
						temp = p[j];
						p[j] = p[j + 1];
						p[j + 1] = temp;
					}
				}
			}
		}

	}
}
