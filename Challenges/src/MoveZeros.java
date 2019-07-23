
public class MoveZeros {

	public static void main(String[] args) {
		int arr[] = new int[50];
		int count = 1;
		int end = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
			System.out.printf("%4d",arr[i]);
			count++;
			if (count == 10) {
				System.out.println();
				count = 1;
			}
		}
		for (int i = 0; i < end + 1; i++) {
			if(arr[i] == 0) {
				for(int j = i; j < end; j++) {
					arr[j] = arr[j+1];
				}
				arr[end] = 0;
				end--;
			}
		}
		System.out.println();
		System.out.println();
		count = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d",arr[i]);
			count++;
			if (count == 10) {
				System.out.println();
				count = 1;
			}
		}
	}

}
