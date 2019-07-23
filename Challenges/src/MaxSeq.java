public class MaxSeq {
	public static Node maxS(int[] table) {
		int count = 0;
		Node[] nodes = new Node[table.length];
		Node n = new Node(table[0], 1, 1);

		for (int i = 1; i < table.length; i++) {
			if (table[i] == n.getElem())
				n.incLen();
			else {
				count = insertNode(nodes, n, count);
				n = new Node(table[i], 1, 1);
			}
		}
		count = insertNode(nodes, n, count);
		return maxNode(nodes, count);
	}

	public static int insertNode(Node[] ns, Node n, int count) {
		boolean found = false;
		for (int i = 0; i < count && !found; i++) {
			if (ns[i].getElem() == n.getElem() && ns[i].getLen() == n.getLen()) {
				found = true;
				ns[i].incOccur();
			}
		}
		if (!found) {
			ns[count] = n;
			count++;
		}
		return count;
	}

	public static Node maxNode(Node[] ns, int count) {
		display(ns, count);
		int n = 0;
		for (int i = 1; i < count; i++) {
			if (ns[i].getLen() > ns[n].getLen())
				n = i;
		}

		return ns[n];
	}

	public static void display(Node[] ns, int count) {
		System.out.print("\n\nThe subsequences are:\n");
		for (int i = 0; i < count; i++) {
			System.out.print("\n" + ns[i]);
		}
		System.out.print("\n");
	}

	/*
	 * public static int Nseqs (Node[] ns, int count, int L){ int N = 0; for (int i
	 * = 0; i < count; i++) if (ns[i].getLen() == L) N = N + ns[i].getOccurs();
	 * return N; }
	 */
	public static void main(String[] args) {

		int[] table = new int[args.length];
		for (int i = 0; i < args.length; i++)
			table[i] = Integer.parseInt(args[i]);

		Node n = maxS(table);

		System.out.print("\n\nThus the first subsequence of max length is:\n" + n + "\n\n");

	}

}