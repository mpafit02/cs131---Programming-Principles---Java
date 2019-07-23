
public class testPoint {
	public static void main(String[] args) {
		Point o = new Point(0, 0);
		System.out.println(o.toString());
		Point p = new Point(1.5, 3.4);
		System.out.println(p.toString());
		p.translate(0.5, -1.4);
		System.out.println("After moving: " + p.toString());
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println(p1 == p2);
		System.out.println(p1.same(p2));
	}
}
