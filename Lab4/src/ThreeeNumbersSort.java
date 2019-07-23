import java.util.Scanner;
public class ThreeeNumbersSort {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Give 1st number: ");
		int a = stdin.nextInt();
		System.out.print("Give 2nd number: ");
		int b = stdin.nextInt();
		System.out.print("Give 3rd number: ");
		int c = stdin.nextInt();
		int temp; 
		
		if (a > b && a > c) {
		    if (c > b) {
		    	temp = b;
		    	b = c;
		    	c = temp;
		    }	
		}else if (b > a && b > c) {
			if (a > c) {
				temp = b;
				b = a;
				a = temp;
			}else {
				temp = b;
		    	b = c;
		    	c = temp;
			}
		}else {
			temp = c;
			c = a;
			a = temp;
			if(c > b){
				temp = c;
				c = b;
				b = temp;
			}
		}
		System.out.println(a + " " + b + " " + c);
		stdin.close();
	}
}