
public class BubbleSort {

	public static void main(String[] args) {
		int[] table = {1,10,2,3,6,2,3,3,4,5,6,7,8,9};
		boolean Sorted;
		int len = table.length - 1;
		do {
		Sorted = true; // Assume that table is sorted
		for (int k = 0; k < len; k++) {
			if (table[k] > table[k+1]){	
				int temp = table[k];
				table[k] = table[k+1];
				table[k+1] = temp;
				Sorted = false; 
				}
		}
		} while (!Sorted && len > 0);
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
			}
	}

}
