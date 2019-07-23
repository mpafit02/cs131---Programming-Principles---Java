
public class dutchalgorithm {


	public static void main(String[] args) {
		int arr[] = new int[15];
		int lo = 0;
		int hi = arr.length - 1;
		int mid = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = StdIn.readInt();
		}
		int temp;
		while (mid <= hi) {
			if (arr[mid] < 3) {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
			} else if (arr[mid] > 6) {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
			} else {
				mid++;
			}
			for (int m = 0; m < arr.length; m++) {
				System.out.print(arr[m] + " ");
			}
			System.out.println();
		}

	}
}
