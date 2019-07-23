
public class ClientSortLib2 {

	public static void print(int[] arr, int end) {
		for (int i = 0; i < end; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		int end;
		System.out.print("Choose sorting method:\n\ta) Selection Sort\n\tb) Insertion Sort\nEnter your selection: ");
		char select = StdIn.readChar();
		System.out.print("Is afksousa?\nEnter your selection: ");
		boolean isAfksousa = StdIn.readBoolean();
		System.out.println("Enter up to 100 positive numbers. Enter 0 to end.\n");
		if (select == 'a') {
			for(int i = 0; i < arr.length; i++) {
				System.out.print("? ");
				arr[i] = StdIn.readInt();
				end = i;
				if(arr[i] == 0) {
					SortLib2.selectionSort(arr, isAfksousa, end);
					print(arr, end);
					break;
				}
			}
		} else if (select == 'b') {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("? ");
				arr[i] = StdIn.readInt();
				end = i;
				if(arr[i] == 0) {
					print(arr, end);
					break;
				}
				if (i != 0) {
					SortLib2.insertionSort(arr, arr[i], isAfksousa);
				}
				
			}
		} else {
			System.out.println("Wrong Input!");
		}

	}

}
