
public class PyramidCharacters {

	public static String printLine(char c, int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += c;
		}
		return s;
	}

	public static void main(String[] args) {
		char c = 'a';
		int times = 1;
		String s = "";
		for (int i = 0; i < 26; i++) {
			s += printLine(' ', 26 - i) + printLine(c, times) + printLine('\n', 1);
			c++;
			times += 2;
		}
		System.out.println(s);
	}

}
