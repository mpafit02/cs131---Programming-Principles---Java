import java.util.Scanner;
public class BinaryEvaluator {
	
	public static final int N = 8;
	
	public static void main(String[] args) {
		int table[] = new int[N];		
		Scanner stdin = new Scanner(System.in);
		System.out.print("8-bit Number: ");
		String bit = stdin.nextLine();
		int sum = 0;
		while(bit.length() != 8) {

			System.out.println("Wrong Input: ");
			System.out.print("8-bit Number: ");
			bit = stdin.nextLine();
			
		}

		for(int i = 0; i < table.length; i++) {
			table[i] = (int)Math.pow(2, table.length - 1 - i);
			System.out.print(table[i] + " ");	
		}
		for(int j = 0; j < bit.length(); j++) {
			if((bit.charAt(j)) == '1') {
				sum += table[j];
			}
		}
		System.out.println("\nNum: " + sum);	
		stdin.close();
	}
	
}
