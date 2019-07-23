
public class testComplex {

	public static void main(String[] args) {
		Complex a = new Complex(5.0, 6.0);
		Complex b = new Complex(-3.0, 4.0);

		StdOut.println("a            = " + a);
		StdOut.println("b            = " + b);
		StdOut.println("Re(a)        = " + a.re());
		StdOut.println("Im(a)        = " + a.im());
		StdOut.println("|a|          = " + a.abs());
		StdOut.println("b + a        = " + b.plus(a));
		StdOut.println("a - b        = " + a.minus(b));
		StdOut.println("a * b        = " + a.times(b));
		StdOut.println("b * a        = " + b.times(a));
	}
}
