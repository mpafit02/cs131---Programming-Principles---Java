
public class Grep2 {

	public static void check(String line, String words[], String kinds[]) {
		boolean result = false;
		for (int i = 0; i < words.length; i++) {
			if (kinds[i].equals("-o")) {
				if (line.contains(words[i])) {
					result = result || true;
				}
			}
			if (kinds[i].equals("-a")) {
				if (line.contains(words[i])) {
					result = result || true;

				}
			}
			if (kinds[i].equals("-n")) {
				if (line.contains(words[i])) {
					result = result && false;

				}
			}
		}
		if (result)	{
			System.out.println(line);
		}
	}

	public static void main(String args[]) {
		int L = 0;
		int count = 0;
		String knd = "";
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals("-n") && !args[i].equals("-o") && !args[i].equals("-a"))
				L++;
		}
		String words[] = new String[L];
		String kinds[] = new String[L];
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-n") || args[i].equals("-o") || args[i].equals("-a")) {
				knd = args[i];
			} else {
				words[count] = args[i];
				kinds[count] = knd;
				count++;
			}
		}
		while (!StdIn.isEmpty()) {
			String line = StdIn.readLine();
			check(line, words, kinds);
		}
	}
}
