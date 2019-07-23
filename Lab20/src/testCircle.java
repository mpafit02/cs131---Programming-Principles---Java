
public class testCircle {

	public static void main(String[] args) {
		Point p = new Point(3.4, 5.7);
		Circle d = new Circle(p, 4);
		System.out.println(d.toString());
		System.out.println("Surface of Circle : " + d.surface());
		System.out.println("Circumference of Circle : " + d.circumference());
		d.translate(1.6, -0.7);
		System.out.println("After moving : " + d.toString());
		Circle d2 = new Circle(p, 4);

		System.out.println(d == d2);
		System.out.println(d.same(d2));
		Point p2 = new Point(11.5, 12.4);
		if (d.isIn(p2)) {
			System.out.println("Is In");
		} else {
			System.out.println("Not In");
		}
		p2.translate(-7.4, -6);
		if (d.isIn(p2)) {
			System.out.println("Is In");
		} else {
			System.out.println("Not In");
		}
		Point[] table = new Point[10];
		for (int i = 0; i < table.length; i++) {
			table[i] = new Point(i, i);
		}
		System.out.println(d.howManyIn(table));
	}

}
