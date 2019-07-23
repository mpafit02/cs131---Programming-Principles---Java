import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Askisi3 {

	public static void main(String[] args) {
		File f = new File("data2.txt");
		double sum = 0;
		double sumSQ = 0;
		double N = 0;
		double x;
		double avg = 0;
		double avgSQ = 0;
		double var = 0;
		double sd = 0;
		try {
			Scanner stdin = new Scanner(f);
			while (stdin.hasNextDouble()) {
				x = stdin.nextDouble();
				sum += x;
				sumSQ += Math.pow(x, 2);
				N++;
			}
			avg = sum/N;
			avgSQ = sumSQ/N;
			var = avgSQ - Math.pow(avg, 2);
			sd = Math.sqrt(var);
			System.out.printf("Sum: \t%.2f\n", sum);
			System.out.printf("SumSQ: \t%.2f\n", sumSQ);
			System.out.printf("Avg: \t%.2f\n", avg);
			System.out.printf("AvgSQ: \t%.2f\n", avgSQ);
			System.out.printf("Var: \t%.2f\n", var);
			System.out.printf("SD: \t%.2f\n", sd);
			stdin.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
