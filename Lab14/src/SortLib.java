
public class SortLib {

	public static void selectionSort(int arr[], boolean afksousa) {
		int max;
		int maxi;
		int temp;

		for (int j = 0; j < arr.length; j++) {
			maxi = 0;
			max = arr[0];
			for (int i = 0; i < arr.length - j; i++) {
				if (afksousa) {
					if (arr[i] >= max) {
						max = arr[i];
						maxi = i;
					}
				} else {
					if (arr[i] <= max) {
						max = arr[i];
						maxi = i;
					}
				}
			}
			temp = arr[arr.length - j - 1];
			arr[arr.length - j - 1] = arr[maxi];
			arr[maxi] = temp;
		}
	}

	public static void insertionSort(int arr[], int num, boolean afksousa) {
		for (int i = 0; i < arr.length; i++) {
			if (afksousa) {
				if (arr[i] >= num) {
					for (int j = arr.length - 1; j > i; j--) {
						arr[j] = arr[j - 1];
					}
					arr[i] = num;
					break;
				}
			} else {
				if (arr[i] <= num) {
					for (int j = arr.length - 1; j > i; j--) {
						arr[j] = arr[j - 1];
					}
					arr[i] = num;
					break;
				}
			}
		}
	}
}
