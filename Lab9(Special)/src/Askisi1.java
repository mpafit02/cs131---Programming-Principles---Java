
public class Askisi1 {
	public static final int N = 9;
	public static void main(String[] args) {
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = StdIn.readInt();
		}
		//System.out.println("Dose k: ");
		int k = StdIn.readInt();
		int temp;	
		for(int j = 0; j < N; j+=k) {
			if(N - j < k) {
				k = N - j;
				for(int i = 0; i < k/2; i++) {
					temp = arr[i + j];
					arr[i + j] = arr[k - 1 + j - i];
					arr[k - 1 + j - i] = temp;
				}
			}else {
				for(int i = 0; i <= k/2; i++) {
					temp = arr[i + j];
					arr[i + j] = arr[k - 1 - i + j];
					arr[k - 1 - i + j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}

}
