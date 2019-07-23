import java.util.Scanner;
public class PascalsTriangles {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Dose arithmo grammon: ");
		int loops = stdin.nextInt();
		int repeat = loops;
		String space = "  ";
		int table1[] = new int[loops + 1];
		int table2[] = new int[loops + 1];
		table1[0] = 1;
		table2[0] = 1;
		for(int j = 0; j < table1.length; j++) {
			table1[j] = 0;
			table2[j] = 0;
		}
		table1[0] = 1;
		table2[0] = 1;
		for(int j = 0; j <= repeat; j++) {
			System.out.print(space);
		}
		System.out.printf("%4d\n",table1[0]);
		for(int i = 0; i < loops; i++){
			for(int j = 1; j < table1.length; j++) {
				table1[i] = 1;
				table2[j] = table1[j - 1] + table1[j];
			}
			for(int j = 0; j < repeat; j++) {
				System.out.print(space);
			}
				for(int k = 0; k < table2.length; k++) {
					
					if (table2[k] != 0) {
						System.out.printf("%4d", table2[k]);
					}
					
				}
			
			for(int j = 0; j < table1.length; j++) {
				table1[j] = table2[j];
				table2[j] = 0;
			}
			table1[0] = 1;
			table2[0] = 1;
			System.out.println();
			repeat--;
			
		}
		stdin.close();
	}

}
