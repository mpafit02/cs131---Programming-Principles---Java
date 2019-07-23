
public class Vector {
	private double vec[];

	// Constructor 1
	public Vector(double[] data) {
		vec = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			vec[i] = data[i];
		}
	}

	// Constructor 2
	public Vector(int size) {
		vec = new double[size];
		for (int i = 0; i < size; i++) {
			vec[i] = 0;
		}
	}

	public String toString() {
		String s = "(" + vec[0];
		for (int i = 1; i < vec.length; i++) {
			s += ", " + vec[i];
		}
		s += ")";
		return s;
	}

	public Vector plus(Vector y) {
		Vector v1 = new Vector(y.vec.length);
		for (int i = 0; i < vec.length; i++) {
			v1.vec[i] = this.vec[i] + y.vec[i];
		}
		return v1;
	}

	public Vector minus(Vector y) {
		Vector v1 = new Vector(y.vec.length);
		for (int i = 0; i < vec.length; i++) {
			v1.vec[i] = this.vec[i] - y.vec[i];
		}
		return v1;
	}

	public Vector times(double num) {
		Vector v1 = new Vector(this.vec);
		for (int i = 0; i < vec.length; i++) {
			v1.vec[i] *= num;
		}
		return v1;
	}

	public double dot(Vector y) {
		double sum = 0;
		for (int i = 0; i < vec.length; i++) {
			sum += this.vec[i] * y.vec[i];
		}
		return sum;
	}

	public double magnitude() {
		double sum = 0;
		for (int i = 0; i < vec.length; i++) {
			sum += Math.pow(this.vec[i], 2);
		}
		return Math.sqrt(sum);
	}

	public double cartesian(int i) {
		return vec[i];
	}

	public Vector direction() {
		Vector v1 = new Vector(this.vec);
		v1 = times(1 / magnitude());
		return v1;
	}
}
