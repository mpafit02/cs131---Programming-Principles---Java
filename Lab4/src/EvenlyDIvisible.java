import java.util.Scanner;
public class EvenlyDIvisible {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give 1st number: ");
		int x = stdin.nextInt();
		System.out.print("Give 2nd number: ");
		int y = stdin.nextInt();
		if ((x % y == 0)||(y % x == 0)) {
			System.out.println("Evenly Divisible");
		}else {
			System.out.println("Not Evenly Divisible");			
		}
		stdin.close();
	}
}
