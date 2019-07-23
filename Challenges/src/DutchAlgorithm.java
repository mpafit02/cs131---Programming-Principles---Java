
public class DutchAlgorithm {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 1, 4, 3, 9, 2, 7, 3, 8, 1, 4, 5, 3, 8 };
		int low = 0, mid = 0, end = arr.length - 1;
		int temp;
		while (mid <= end) {
			if (arr[mid] < 3) {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] > 6) {
				temp = arr[end];
				arr[end] = arr[mid];
				arr[mid] = temp;
				end--;
			} else {
				mid++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
