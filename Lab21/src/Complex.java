
public class Complex {
	private double a; // declare the real part
	private double b; // declare the imaginary part

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	// create a new object with the given real and imaginary parts
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// return a string representation of the invoking Complex object
	public String toString() {
		return a + " + " + b + "i";
	}

	// return abs/modulus/magnitude
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	// return a new Complex object
	public Complex plus(Complex c) {
		return new Complex(a + c.getA(), b + c.getB());
	}

	// return a new Complex object
	public Complex minus(Complex c) {
		return new Complex(a - c.getA(), b - c.getB());
	}

	// return a new Complex object
	public Complex times(Complex c) {
		return new Complex(a * c.getA() - b * c.getB(), b * c.getA() + a * c.getB());
	}

	// return the real part
	public double re() {
		return a;
	}

	// return imaginary part
	public double im() {
		return b;
	}
}
