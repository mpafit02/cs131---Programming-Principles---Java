
public class TipomaAsteriskon {
	public static void main(String[] args) {
		for(int i = 5; i >= -5; i --) {
			int stars = Math.abs(i);
			for(int j = 0; j < stars; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
