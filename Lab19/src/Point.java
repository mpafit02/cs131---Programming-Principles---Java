
public class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 2;
		this.y = 2;
	}

	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean same(Point p2) {
		if(this.x == p2.x && this.y == p2.y) {
			return true;
		}else {
			return false;
		}
	}
}
