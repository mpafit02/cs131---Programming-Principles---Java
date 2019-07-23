import java.util.Scanner;
public class Askisi1 {

	public static void main(String[] args) {
		double[] table = new double[10];
		System.out.println("Give 10 numbers: ");
		Scanner stdin = new Scanner(System.in);
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		double sum = 0;
		double mo = 0;
		for(int i = 0 ; i < table.length; i++) {
			table[i] = stdin.nextDouble();
			sum += table[i];
			if (table[i] > max) {
				max = table[i];
			}
			if (table[i] < min) {
				min = table[i];
			}
		}
		mo = sum / 10;
		System.out.println("O MAX einai: " + max);
		System.out.println("O MIN einai: " + min);
		System.out.println("O MO einai: " + mo);
		stdin.close();
	}

}
