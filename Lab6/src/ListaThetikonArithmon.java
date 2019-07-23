import java.util.Scanner;
public class ListaThetikonArithmon {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int max = 1, line = 1, maxline = 1, i = 1;
		System.out.println("Tha dineis thetikoys akeraious arithmous, ena-ena tin fora.\nGia na stamatiseis dwse to 0 h arnitiko arithmo."); 
		do{
			System.out.print("Dose arithmo " + line + ": ");
			i = stdin.nextInt();
			if (i > max) {
				max = i;
				maxline = line;
			}
			line++;
		}while(i > 0);
		line -=2;
		System.out.print("O megistos einai o " + max + " kai einai o " + maxline + "os arithmos mias listas megethous " + line); 

		stdin.close();
	}
}
