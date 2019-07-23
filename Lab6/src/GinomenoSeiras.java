import java.util.Scanner;
public class GinomenoSeiras {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num = stdin.nextInt();
		int gin = 1;
		while (num >= 0) {
			gin *= num;
			System.out.print("Give a number: ");
			num = stdin.nextInt();
		}
		stdin.close();
		System.out.print("To ginomeno einai: " + gin);
	}

}
