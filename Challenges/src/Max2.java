
public class Max2 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int max2 = max;
		System.out.print("Give a number: ");
		int num = StdIn.readInt();
		if(num == 0) {
			System.out.print("No input given.");
		}else {
			while(num!=0) {
				if (num > max) {
					max2 = max;
					max = num;
				}
				System.out.print("Give a number: ");
				num = StdIn.readInt();
			}
			if (max2 == Integer.MIN_VALUE) {
				System.out.print("All numbers are the same");
			}else {
				System.out.print("Max1 = " + max + "\nMax2 = " + max2);
			}
		}
		

	}

}
