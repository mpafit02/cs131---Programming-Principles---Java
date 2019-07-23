
public class testVector {

	public static void main(String[] args) {
		 double[] xdata = { 1.0, 2.0, 3.0, 4.0 };
		 double[] ydata = { 5.0, 2.0, 4.0, 1.0 };
		 Vector x = new Vector(xdata);
		 Vector y = new Vector(ydata);
		 StdOut.println("x = " + x);
		 StdOut.println("y = " + y);
		 StdOut.println("x + y = " + x.plus(y));
		 StdOut.println("10x = " + x.times(10.0));
		 StdOut.println("|x| = " + x.magnitude());
		 StdOut.println("<x, y> = " + x.dot(y));
		 StdOut.println("|x - y| = " + x.minus(y).magnitude());
		
		}

}
