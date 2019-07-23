import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		int num, sum = 0;
		double aver;
		Scanner stdin = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.println("Give Number: ");
			num = stdin.nextInt();
			sum += num;
		}
		aver = (double)sum / 4;
		System.out.println("Average : " + aver);
		stdin.close();
	}
}
