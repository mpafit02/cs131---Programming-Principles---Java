
public class Rectangle {
	private double x;
	private double y;
	private double width;
	private double height;

	// Setters
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getPerimeter() {
		return height * 2 + width * 2;
	}

	public double getArea() {
		return height * width;
	}

	// Constructors
	public Rectangle() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods
	public boolean contains(double x, double y) {
		if ((x <= (width / 2 + this.x)) && (x >= (-width / 2 + this.x)) && (y <= (height / 2 + this.y))
				&& (y >= (-height / 2 + this.y))) {
			return true;
		} else {
			return false;
		}
	}

	public boolean contains(Rectangle rec) {
		if (this.contains(rec.getX() + (rec.getWidth() / 2), rec.getY() + (rec.getHeight() / 2))
				&& this.contains(rec.getX() - (rec.getWidth() / 2), rec.getY() - (rec.getHeight() / 2))) {
			return true;
		} else {
			return false;
		}
	}

	public boolean overlaps(Rectangle rec) {
		return rec.contains(this);
	}
}
