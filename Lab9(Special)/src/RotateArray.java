
public class RotateArray {
	public static final int N = 3;
	public static void main(String[] args) {
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = StdIn.readInt();
		}
		int k = StdIn.readInt();
		int temp;
		for(int i = 0; i < k; i++) {
			temp = arr[N - 1];
			for(int j = N - 2; j > 0; j--) {
				arr[j+1] = arr[j];
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
