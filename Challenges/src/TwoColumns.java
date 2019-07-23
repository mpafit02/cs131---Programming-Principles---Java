
public class TwoColumns {

	public static String line(int N, char c) {
		String s = "";
		for (int i = 1; i <= N; i++)
			s = s + c;
		return s;
	}

	public static String twoCols(String[] cs, int count) {
		String s = "";
		int max = cs[0].length();
		for (int i = 0; i < count; i++) {
			if (cs[i].length() > max) {
				max = cs[i].length();
			}
		}
		max += 5;
		for (int i = 0; i <= count / 2; i++) {
			s += cs[i] + line(max - cs[i].length(), ' ') + cs[i + count / 2] + "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		int count = 0;
		String[] ls = new String[300];
		while (!StdIn.isEmpty()) {
			ls[count] = StdIn.readLine();
			count++;
		}
		System.out.println(twoCols(ls, count));
	}
}
