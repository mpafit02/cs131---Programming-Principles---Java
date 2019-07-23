import java.util.Arrays;

public class SortArray {

	public static void sortNum(double arr[], boolean increasing) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - 1; j++) {
				if(increasing) {
					if(arr[j] < arr[j+1]) {
						double temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]= temp;
					}
				}else {
					if(arr[j] > arr[j+1]) {
						double temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]= temp;
					}
				}
			}
		}
	}
	
	public static void sortString(String arr[], boolean increasing) {
	Arrays.toString(arr);
	Arrays.sort(arr);
	}
}
