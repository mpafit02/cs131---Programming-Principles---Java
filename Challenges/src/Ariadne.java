
public class Ariadne {

	public static void main(String[] args) {
		int numx = Integer.parseInt(args[0]);
		int numy = Integer.parseInt(args[1]);
		int arr[] = new int[3];
		int x = numx;
		int y = numy;
		int i = 0, sum1 = 0, sum2 = 0;
		if (x > y || x < 100 || y < 100) {
			System.out.println("Wrong Input .. program terminates");
		} else {
			System.out.println("The ariadne nos from " + x + " to " + y + " are:");
			for (int k = numx; k <= numy; k++) {
				x = k;
				i = 0;
				while (x != 0) {
					arr[i] = x % 10;
					x /= 10;
					i++;
				}
				sum1 = 0; sum2 = 0;
				for (int j = 0; j < arr.length; j++) {
					if (j == 0 || j == arr.length - 1) {
						sum2 += arr[j];	
					}else {
						sum1 += arr[j];						
					}
				}	
				if(sum1 == sum2) {
					System.out.println(k);
				}
			}
		}
	}

}
