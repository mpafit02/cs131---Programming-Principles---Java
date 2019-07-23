
public class DublicateElements {

	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
			System.out.printf("%4d", arr[i]);
		}

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[i] == arr[j] && i != j) {
					for (int k = j; k < arr.length - 1; k++) {
						arr[k] = arr[k + 1];
					}
					len--;
				}
			}
		}
		System.out.println();
		System.out.println(len);
	}

}
