
public class ReverseInteger {

	public static int reverse(int number) {
	    if (number == 0)
	        return 0;

	    int n = number;
	    int pow = 1;

	    while (n >= 10)
	    {
	        n = n / 10;
	        pow = pow * 10;
	    }
	    return (n + reverse(number - n*pow)*10);
	}

	public static void main(String[] args) {
		int m = StdIn.readInt();
		System.out.println(reverse(m));
	}

}
