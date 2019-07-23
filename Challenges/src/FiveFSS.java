
public class FiveFSS {

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int days = 365;
		boolean isDisektos;
		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			isDisektos = true;
			days = 366;
		} else {
			isDisektos = false;
		}
		int arr[] = new int[days];
		arr[0] = day;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != 7) {
				arr[i] = arr[i - 1] + 1;
			} else {
				arr[i] = 1;
			}
		}
		if (arr[0] == 5) {
			System.out.println("January");
		}
			if (isDisektos) {
				if (arr[60] == 5) {
					System.out.println("March");
				}
				if (arr[121] == 5) {
					System.out.println("May");
				}
				if (arr[182] == 5) {
					System.out.println("July");
				}
				if (arr[213] == 5) {
					System.out.println("August");
				}
				if (arr[274] == 5) {
					System.out.println("October");
				}
				if (arr[335] == 5) {
					System.out.println("December");
				}
			}else {
				if (arr[59] == 5) {
					System.out.println("March");
				}
				if (arr[120] == 5) {
					System.out.println("May");
				}
				if (arr[181] == 5) {
					System.out.println("July");
				}
				if (arr[212] == 5) {
					System.out.println("August");
				}
				if (arr[273] == 5) {
					System.out.println("October");
				}
				if (arr[334] == 5) {
					System.out.println("December");
				}

		}
	}

}
