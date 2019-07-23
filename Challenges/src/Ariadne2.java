
public class Ariadne2 {

	public static void main(String[] args) {
		int numx = Integer.parseInt(args[0]);
		int numy = Integer.parseInt(args[1]);
		int x = numx;
		int y = numy;
		int d = 0, j = 0;
		int i = 0, sum1 = 0, sum2 = 0;
		if (x > y || x < 100 || y < 100) {
			System.out.println("Wrong Input .. program terminates");
		} else {
			System.out.println("The ariadne nos from " + x + " to " + y + " are:");
			for (int k = numx; k <= numy; k++) {
				x = k;
				i = 0;
				sum1 = 0;
				sum2 = 0;
				while (x != 0) {
					d = x % 10;
					if(i == 0) {
						sum1 += d;
					}else {
						sum2 += d;
					}
					x /= 10;
					i++;
				}
				sum1 += d;
				sum2 -= d;
				if(sum1 == sum2) {
					System.out.print(k + " ");
					j++;
					if(j == 9) {
						System.out.println();
						j = 0;
					}
				}
			}
		}
	}

}
