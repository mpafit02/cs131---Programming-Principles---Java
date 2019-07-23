
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Leap Years 0 - 2020");
		int count = 1;
		for (int i = 0; i <= 2020; i++) {
			if ( i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				System.out.printf("%5d",i);
				count++;
			}
			if (count == 15) {
				System.out.println();
				count = 1;
			}
		}
	}
}
