
public class ThreeDigits {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int temp, c = 0;
		arr[0] = Integer.parseInt(args[0]);
		arr[1] = Integer.parseInt(args[1]);
		arr[2] = Integer.parseInt(args[2]);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int min = arr[0] * 100 + arr[1] * 10 + arr[2];
		System.out.println("Min = " + min);
		
		int max = arr[2] * 100 + arr[1] * 10 + arr[0];
		System.out.println("Max = " + max);
		
		for(int i = min; i <= max; i++) {
			if(i > 99) {
			if(i / 100 == i % 10) {
				System.out.print(i + " ");
				c++;
				if(c == 9) {
					System.out.println();
					c = 0;
				}
			}
			}else if(i > 9){
				if(i / 10 == i % 10) {
					System.out.print(i + " ");
					c++;
					if(c == 9) {
						System.out.println();
						c = 0;
					}
				}
			}else {
				System.out.print(i + " ");
				c++;
				if(c == 9) {
					System.out.println();
					c = 0;
				}
			}
		}
	}

}
