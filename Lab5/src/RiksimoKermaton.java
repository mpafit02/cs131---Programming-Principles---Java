import java.util.Scanner;
public class RiksimoKermaton {

	public static void main(String[] args) {
		int h = 0;
		int l = 0;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Proto Riksimo: ");
		String c1 = stdin.nextLine();
		System.out.print("Deftero Riksimo: ");
		String c2 = stdin.nextLine();
		System.out.print("Trito Riksimo: ");
		String c3 = stdin.nextLine();
		System.out.print("Tetarto Riksimo: ");
		String c4 = stdin.nextLine();
		System.out.print("Pepto Riksimo: ");
		String c5 = stdin.nextLine();
		
		switch(c1) {
		case "h" :
			h++;
			break;
		case "l" :
			l++;
			break;
		}
		
		switch(c2) {
		case "h" :
			h++;
			break;
		case "l" :
			l++;
			break;
		}
		
		switch(c3) {
		case "h" :
			h++;
			break;
		case "l" :
			l++;
			break;
		}
		
		switch(c4) {
		case "h" :
			h++;
			break;
		case "l" :
			l++;
			break;
		}
		
		switch(c5) {
		case "h" :
			h++;
			break;
		case "l" :
			l++;
			break;
		}
		System.out.println("Arithmos Kefalon: " + h);
		System.out.println("Arithmos Grammaton: " + l);
		System.out.println("Pososto Kefalon: " + h*20 + "%");
		System.out.println("Pososto Grammaton: " + l*20 + "%");
		stdin.close();
	}

}
