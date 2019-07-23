import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give a date: ");
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		if (b > 0 && b < 13) {
		if ((c % 400 == 0 || (c % 4 == 0 && c % 100 != 0)) && (b == 2) && (a > 0 && a <= 29)){
			System.out.println("Date");	
		}else if((b == 2) && (a > 0 && a <= 28)) {
			System.out.println("Date");	
		}else if((b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && (a > 0 && a <= 31)) {
			System.out.println("Date");	
		}else if(!(b == 1 || b == 2 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && (a > 0 && a <= 30)){
			System.out.println("Date");	
		}else {
			System.out.println("Not Date");	
		}
		stdin.close();
		}
	}
}
