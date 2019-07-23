
public class TipomaKiklouAsteriskon {
	public static void main(String[] args) {
		for(double i = -5; i <=5; i+=0.5) {
			for(double j = -5; j <=5; j+=0.5) {
				if (i*i + j*j > 16) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
