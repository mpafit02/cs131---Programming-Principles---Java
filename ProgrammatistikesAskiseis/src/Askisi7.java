import java.util.Scanner;
public class Askisi7 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Dose size: ");
		int size = stdin.nextInt();
		
		while(size <= 1) {
			System.out.print("Dose size > 1: ");
			size = stdin.nextInt();
		}
		int n = 2;
		int space = size * 2;
		for(int i = 0; i < size; i++) {
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
			System.out.print("*");
			}
			System.out.println();
			n+=2;
			space--;
		}
		n -= size;
		space = size * 2 - (int)Math.round(size/2);
		for(int i = 0; i < size; i++) {
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
			System.out.print("*");
			}
			System.out.println();
			n+=2;
			space--;
		}
		n -= size;
		space = size;
		for(int i = 0; i < size; i++) {
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
			System.out.print("*");
			}
			System.out.println();
			n+=2;
			space--;
		}	
		int rows = size + (int)Math.round(size/2);
		space = rows + 1;
		for(int i = 0; i < rows; i++) {
			for(int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < size; j++) {
			System.out.print("|");
			}
			System.out.println();
			n+=2;
		}	
		stdin.close();
	}

}
