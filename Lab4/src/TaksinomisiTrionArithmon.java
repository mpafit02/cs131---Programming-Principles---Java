import java.util.Scanner;
public class TaksinomisiTrionArithmon {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give 1st number: ");
		int a = stdin.nextInt();
		System.out.print("Give 2nd number: ");
		int b = stdin.nextInt();
		System.out.print("Give 3rd number: ");
		int c = stdin.nextInt();
		int temp;
		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}
		if(c > a) {
			temp = c;
			c = a;
			a = temp;
		}
		if (c > b) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a + " , " + b + " , " + c);
		
		stdin.close();
	}
}
