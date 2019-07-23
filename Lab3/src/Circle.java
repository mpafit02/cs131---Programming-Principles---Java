import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		double r,p = 0,e = 0;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Give R : ");
		r = stdin.nextDouble();
		p = Math.PI*r*2;
		e = Math.PI*r*r;
		System.out.println("Perimetros : " + p);
		System.out.println("Emvadon : " + e);
		stdin.close();
	}
}
