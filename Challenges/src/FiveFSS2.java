
public class FiveFSS2 {

	public static boolean isLeap(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String months[] = { "Januray", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		if (isLeap(year)) {
			days[1] = 29;
		}
		for (int i = 0; i < 12; i++) {
			if(day == 5 && days[i] == 31) {
				System.out.println(months[i]);
			}
			day = day + days[i] - 28;
			if(day > 7) {
				day -= 7;
			}
		}
	}

}
