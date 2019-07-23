
public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = { 0, 3, 4, 5, 6, 7, 8, 9, 0, 3, 5, 2, 1, 2 };
		int min2 = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min2 = min;
				min = arr[i];
			}
			if(arr[i] < min2 && arr[i] != min) {
				min2 = arr[i];
			}
		}
		System.out.println(min2);
	}

}
