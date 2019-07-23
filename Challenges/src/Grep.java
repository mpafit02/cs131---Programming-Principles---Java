
public class Grep {

	public static void main(String[] args) {

		String arrOr[] = new String[10];
		String arrAnd[] = new String[10];
		String arrNot[] = new String[10];
		int cor = 0;
		int cand = 0;
		int cnot = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-n")) {
				for (int j = i + 1; j < args.length; j++) {
					if (!(args[j].equals("-o") || args[j].equals("-a"))) {
						arrNot[i] = args[j];
						cnot++;
					} else {
						break;
					}
				}
			}
			if (args[i].equals("-o")) {
				for (int j = i + 1; j < args.length; j++) {
					if (!(args[j].equals("-n") || args[j].equals("-a"))) {
						arrOr[i] = args[j];
						cand++;
					} else {
						break;
					}
				}
			}
			if (args[i].equals("-a")) {
				for (int j = i + 1; j < args.length; j++) {
					if (!(args[j].equals("-o") || args[j].equals("-n"))) {
						arrAnd[i] = args[j];
						cor++;
					} else {
						break;
					}
				}
			}
		}

		while (!StdIn.isEmpty()) {
			String s = StdIn.readLine();
			boolean cont = false;
			for (int i = 0; i < cand; i++) {
				cont = cont && s.contains(arrAnd[i]);
			}
			for (int i = 0; i < cor; i++) {
				cont = cont || s.contains(arrOr[i]);
			}
			for (int i = 0; i < cnot; i++) {
				cont = cont && !(s.contains(arrNot[i]));
			}
			if (cont) {
				System.out.println(s);
			}

		}
	}
}
