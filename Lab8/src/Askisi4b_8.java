import java.util.Scanner;
public class Askisi4b_8 {
	public static final int SERIES_LENGTH = 10;	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double table[] = new double[SERIES_LENGTH];
		System.out.print("Give a Number for the 0 iput: ");
		double num = stdin.nextDouble();
		int i = 1;
		while((num >= 0) && (i < SERIES_LENGTH)) {
			System.out.print("Give a Number for the " + i + " input: ");
			table[i] = num;
			num = stdin.nextDouble();
			i++;
		}

		for(int j = 1; j < i; j++) {
			System.out.println(table[j]);
		}
		System.out.print("Table's size is: " + (i-1));
		stdin.close();

	}

}
