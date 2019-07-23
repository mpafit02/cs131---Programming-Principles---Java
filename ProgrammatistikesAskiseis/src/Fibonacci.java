
public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.println("------------FIBONACCI------------");
		System.out.printf("%-7d%-7d%-7d",a,b,c);
		for(int i = 3; i < 30; i++) {
			a = b;
			b = c;
			c = a + b;
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%-7d",c);
		}
	}

}
