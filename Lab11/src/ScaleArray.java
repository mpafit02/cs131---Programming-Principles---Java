
public class ScaleArray {
	public static double findSmaller(double arr[]) {
		double smaller = arr[0]; 
		for(int i = 1; i < arr.length; i++){
			if (arr[i] < arr[0]) {
				smaller = arr[i];
			}
		}
		return smaller;
		
	}
	public static double findBigger(double arr[]) {
		double bigger = arr[0]; 
		for(int i = 1; i < arr.length; i++){
			if (arr[i] > arr[0]) {
				bigger = arr[i];
			}
		}
		return bigger;
	}
	public static void scaleElement(double arr[], double smaller, double bigger) {
		for(int i = 0; i < arr.length; i++){
			arr[i] = (arr[i] - smaller)/(bigger - smaller);
			System.out.printf("%.2f\r\n",arr[i]);
		}
	}
	public static void main(String[] args) {
		double arr[] = new double[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = StdIn.readDouble();
		}
		double smaller = findSmaller(arr);
		double bigger = findBigger(arr);
		scaleElement(arr,smaller,bigger);
	}

}
