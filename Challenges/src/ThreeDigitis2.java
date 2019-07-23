
public class ThreeDigitis2 {
	public static boolean isPalindrome(int num) {
		if (num > 99 && (num % 10 == num / 100)) {
			return true;
		} else if (num > 9 && (num % 10 == num / 10)) {
			return true;
		} else if (num < 10) {
			return true;
		}
		return false;
	}

	public static void Max(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = Integer.parseInt(args[0]);
		arr[1] = Integer.parseInt(args[1]);
		arr[2] = Integer.parseInt(args[2]);
		Max(arr);
		int min = arr[0] * 100 + arr[1] * 10 + arr[2];
		int max = arr[2] * 100 + arr[1] * 10 + arr[0];
		int count = 0;
		for (int i = min; i <= max; i++) {
			if (isPalindrome(i)) {
				System.out.printf("%4d",i);
				count++;
				if (count > 10) {
					System.out.println();
					count= 0;
				}
			}
		}
	}

}
