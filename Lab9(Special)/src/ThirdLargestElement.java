
public class ThirdLargestElement {
	public static final int N = 10;
	public static void main(String[] args) {
		int arr[] = new int[N];
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			arr[i] = StdIn.readInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < N; i++) {
			if((arr[i] > max2)&&(arr[i] != max)) {
				max2 = arr[i];
			}
		}
		for(int i = 0; i < N; i++) {
			if((arr[i] > max3)&&(arr[i] != max2)&&(arr[i] != max)){
				max3 = arr[i];
			}
		}
		System.out.printf("Max: %3d\nMax2: %3d\nMax3: %3d", max,max2,max3);
	}

}
