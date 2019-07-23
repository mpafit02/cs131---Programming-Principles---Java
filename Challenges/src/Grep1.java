
public class Grep1 {
	public static boolean satisfies(boolean[] result, String[] ops) {
		return andOK(ops, result) && orOK(ops, result) && notOK(ops, result);
	}

	public static boolean andOK(String[] ops, boolean[] result) {
		boolean ans = true;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("-a"))
				ans = ans && result[i];
		}
		return ans;
	}

	public static boolean notOK(String[] ops, boolean[] result) {
		boolean ans = true;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("-n"))
				ans = ans && !result[i];

		}
		return ans;
	}

	public static boolean orOK(String[] ops, boolean[] result) {
		boolean ans = false;
		boolean flag = false;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("-o")) {
				ans = ans || result[i];
				flag = true;
			}
		}
		if (!flag)
			return true;
		else
			return ans;
	}

	public static void main(String[] args) {
		int L = 0;
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals("-n") && !args[i].equals("-o") && !args[i].equals("-a"))
				L++;
		}

		String[] words = new String[L];
		String[] boolOp = new String[L];
		boolean[] result = new boolean[L];
		String op = "";
		int count = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-n") || args[i].equals("-o") || args[i].equals("-a"))
				op = args[i];
			else {
				words[count] = args[i];
				boolOp[count] = op;
				count++;
			}
		}
		while (!StdIn.isEmpty()) {
			String line = StdIn.readLine();
			for (int i = 0; i < result.length; i++)
				result[i] = line.contains(words[i]);
			if (satisfies(result, boolOp))
				System.out.println(line);
		}
	}

}
