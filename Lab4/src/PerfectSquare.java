import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give a number: ");
		int a = stdin.nextInt();
		int root = (int)Math.sqrt(a);
		if (a % root == 0 ) {
			System.out.println("Perfect Square.");
		}else {
			System.out.println("Not Perfect Square.");
		}
		stdin.close();
	}

}
