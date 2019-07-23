
public class Askisi4 {

	public static void main(String[] args) {
		double y, a, b, h, x;
		a = 2;
		h = 3;
		b = 100;
		x = 0;
		int i = 0;
		while(x < b) {
			x = a + i * h;
			y = 2 * Math.pow(x,2) + 5 * Math.sqrt(x);
			System.out.printf("Y : %8.2f\tX : %8.2f\n",y,x);
			i++;
		}
	}

}
