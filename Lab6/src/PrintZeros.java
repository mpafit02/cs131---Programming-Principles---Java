import java.util.Scanner;

public class PrintZeros {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num = stdin.nextInt();
		int i;
		while (num >= 0) {
			System.out.println("Ean to n einai " + num + " tote: ");
			for(i = 0; i < num; i++) {
				System.out.print("o");
			}
			if (i == num) {
				System.out.println("O");
			}
			for(i = 0; i < num; i++) {
				System.out.print("^");
			}
			System.out.println();
			System.out.print("Give a number: ");
			num = stdin.nextInt();
		}
		stdin.close();
		System.out.print("The End!");
	}

}
