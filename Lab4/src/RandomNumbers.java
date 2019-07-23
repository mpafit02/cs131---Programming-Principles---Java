
public class RandomNumbers {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		int c = (int)(Math.random()*10)+1;
		
		System.out.println(a + " " + b + " " + c);
		if (a == b && b == c) {
			System.out.println("YOU WON! YOU HAVE ALL THREE THE SAME!");
		}else if ((a == b && a != c) || (b == c && b != a)) {
			System.out.println("You won! You have a pair the same.");
		}else {
			System.out.println("Sorry you lose");
		}
	}

}
