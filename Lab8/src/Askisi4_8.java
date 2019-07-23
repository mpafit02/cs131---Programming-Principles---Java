import java.util.Scanner;
public class Askisi4_8 {
	public static final int SERIES_LENGTH = 10;	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double table[] = new double[SERIES_LENGTH];
		int num = 0;
		for(int i = 0; i < SERIES_LENGTH; i++) {
			System.out.print("Give a Number for the " + i + " imput: ");
			table[i] = stdin.nextDouble();
			if( table[i] < 0) {
				table[i] = 0;
				break;
			}else {
				num++;
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.println(table[i]);
		}
		System.out.print("Table's size is: " + num);
		stdin.close();

	}

}
