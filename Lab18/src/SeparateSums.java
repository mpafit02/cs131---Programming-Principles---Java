
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeparateSums {

	public static void main(String[] args) {
		File f = new File("data3.txt");
		String s;
		int sumx = 0, sumy = 0, x, y;
		try {
			Scanner stdin = new Scanner(f);
			while (stdin.hasNext()) {
				s = stdin.next();
				if (s.equals("x=")) {
					x = stdin.nextInt();
					sumx += x;
				} else {
					y = stdin.nextInt();
					sumy += y;
				}
			}
			System.out.println("Sum x: " + sumx);
			System.out.println("Sum y: " + sumy);
			stdin.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
