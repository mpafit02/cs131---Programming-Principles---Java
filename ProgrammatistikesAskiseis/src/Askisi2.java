import java.util.Scanner;
public class Askisi2 {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a real, non-negative, number: ");
		double x =  stdin.nextDouble();
		double eps = 0.0001;
		double eps2 = 1;
		double y;
		double sqrt = 0;
		if (x >= 0) {
			sqrt = Math.sqrt(x);
			System.out.println("The square root of " + x + " is " + sqrt);
		}else {
			System.out.println("Non-negative numbers are not allowed.");
		}
		if (x >= 0) {
			y = x;
			while(Math.abs(x - Math.pow(y, 2)) > eps2) {
				y = (y + x/y)/2.0;
			}
			System.out.printf("The square root of  %.6f is %.6f\n",x,y);
			y = x;
			while(Math.abs(x - Math.pow(y, 2)) > eps) {
				y = (y + x/y)/2.0;
			}
			System.out.printf("The square root of  %.6f is %.6f\n",x,y);
		}else {
			System.out.println("Non-negative numbers are not allowed.");
		}
		stdin.close();
	}
}
