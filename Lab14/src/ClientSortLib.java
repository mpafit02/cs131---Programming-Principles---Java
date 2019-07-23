
public class ClientSortLib {

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("Choose sorting method:\n\ta) Selection Sort\n\tb) Insertion Sort\nEnter your selection: ");
		char select = StdIn.readChar();
		System.out.print("Is afksousa?\nEnter your selection: ");
		boolean isAfksousa = StdIn.readBoolean();
		if (select == 'a') {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("? ");
				arr[i] = StdIn.readInt();
			}
			SortLib.selectionSort(arr, isAfksousa);
			print(arr);
		} else if (select == 'b') {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("? ");
				arr[i] = StdIn.readInt();
				if (i != 0) {
					SortLib.insertionSort(arr, arr[i], isAfksousa);
				}
			}
		} else {
			System.out.println("Wrong Input!");
		}

	}

}
