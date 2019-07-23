
public class Letters {

	public static void check(char c1, char c2) {
		if ((int)c1 != (int)c2 && (int)c1 < (int)c2) {
			System.out.println((char)(c1) + " ");
			check((char)(c1 + 1), c2);
		}else if ((int)c1 != (int)c2 && (int)c1 > (int)c2) {
			System.out.println((char)(c1) + " ");
			check((char)(c1 - 1), c2);
		}else {
			System.out.println(c2);
		}
	}

	public static void main(String[] args) {
		char c1 = 'z';
		char c2 = 'd';
		check(c1, c2);
	}
}
