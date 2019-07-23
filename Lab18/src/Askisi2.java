import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Askisi2 {

	public static void main(String[] args) {
		File f = new File("data.txt");
		int sum = 0;
		try {
			Scanner stdin = new Scanner(f);
			while (stdin.hasNextInt()) {
				sum += stdin.nextInt();
			}
			System.out.println("Sum: " + sum);
			stdin.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
