
public class PowerOf3 {

	public static boolean powerof3(int num) {
		if ((double)num / 3 == 1) {
			return true;
		} else if ((double)num / 3 < 1) {
			return false;
		} else {
			System.out.println(num/3);
			return true && powerof3(num / 3);
		}
	}

	public static void main(String[] args) {
		int num = StdIn.readInt();
		if (powerof3(num)) {
			System.out.println("Power of 3.");
		} else {
			System.out.println("Not power of 3.");
		}
	}

}
