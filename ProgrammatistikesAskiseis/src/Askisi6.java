import java.util.Scanner;

public class Askisi6 {
	public static final int N = 10;
	public static void main(String[] args) {
		double[] table = new double[10];
		System.out.println("Give 10 numbers: ");
		Scanner stdin = new Scanner(System.in);
		double max = Integer.MIN_VALUE;
		double max2 = Integer.MIN_VALUE;
		for(int i = 0 ; i < table.length; i++) {
			table[i] = stdin.nextDouble();
			if (table[i] > max) {
				max = table[i];
			}
		}
		for(int i = 0 ; i < table.length; i++) {
			if ((table[i] != max)&&(table[i] > max2)) {
				max2 = table[i];
			}
		}		

		System.out.println("O MAX einai: " + max);
		System.out.println("O MAX2 einai: " + max2);
		stdin.close();
	}

}
