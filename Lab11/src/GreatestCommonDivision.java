
public class GreatestCommonDivision {

	public static int gcd(int x, int y) {
		int temp = x;
		while( y != 0) {
			if((x >= y)&&(y > 0)) {
				temp = y;
				y = x % y;
				x = temp;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.print("Give first num: ");
		int x = StdIn.readInt();
		System.out.print("Give second num: ");
		int y = StdIn.readInt();
		int temp = x;
		if (y > x) {
			temp = x;
			x = y;
			y = temp;
		}
		System.out.println("The Greatest Common Division is: " + gcd(x,y));
	}

}
