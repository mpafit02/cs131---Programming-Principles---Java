
public class testRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 4, 3);
		Rectangle r2 = new Rectangle(1, 1, 1, 1);
		Rectangle r3 = new Rectangle(-1, 0, 8, 6);
		Rectangle r4 = new Rectangle(4, 3, 1, 1);
		System.out.println("Perimeter r1: " + r1.getPerimeter());
		System.out.println("Area r1: " + r1.getArea());
		System.out.println(r1.contains(1, 1));
		System.out.println(r1.contains(-1, -1));
		System.out.println(r1.contains(r2));
		System.out.println(r1.contains(r3));
		System.out.println(r1.contains(r4));
		System.out.println(r1.overlaps(r3));
		System.out.println(r1.overlaps(r4));
	}

}
