
public class Circle {
	private Point center;
	private double radius;

	public Circle() {
		center = new Point(0.0, 0.0);
		radius = 1.0;
	}

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public void translate(double dx, double dy) {
		center.setX(center.getX() + dx);
		center.setY(center.getY() + dy);
	}

	public double surface() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double circumference() {
		return 2 * Math.PI * radius;
	}

	public boolean same(Circle c2) {
		if (center.same(c2.center) && radius == c2.radius) {
			return true;
		} else {
			return false;
		}
	}

	private double distance(Point p) {
		return Math.sqrt(Math.pow(center.getX() - p.getX(), 2) + Math.pow(center.getY() - p.getY(), 2));
	}

	public boolean isIn(Point p) {
		if (distance(p) <= radius) {
			return true;
		} else {
			return false;
		}
	}

	public int howManyIn(Point[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isIn(arr[i])) {
				sum++;
			}
		}
		return sum;
	}

	public String toString() {
		// return "Circle - center: (" + center.getX() + ", " + center.getY() + ")
		// radius: " + radius;
		return "Circle - center: " + center + " radius: " + radius;
	}
}
