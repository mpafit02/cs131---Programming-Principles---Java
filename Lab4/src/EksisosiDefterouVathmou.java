import java.util.Scanner;
public class EksisosiDefterouVathmou {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give a: ");
		int a = stdin.nextInt();
		System.out.print("Give b: ");
		int b = stdin.nextInt();
		System.out.print("Give c: ");
		int c = stdin.nextInt();
		int d, x1, x2;
		if(a == 0 && b == 0) {
			System.out.println("Den iparxoun liseis.");
		}else if(a == 0 && b != 0) {
			x1 = -c/b;
			System.out.println("x1: " + x1);
		}else if (a != 0){
			d = b * b - 4 * a * c;
			if (d == 0) {
				x1 = (-b / (2*a));
				x2 = x1;
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}else if (d > 0) {
				x1 = (-b + (int)Math.sqrt(d))/ (2*a);
				x2 = (-b - (int)Math.sqrt(d))/ (2*a);
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}else {
				System.out.println("Den iparxoun liseis.");
			}
		}
		
		stdin.close();
	}
}