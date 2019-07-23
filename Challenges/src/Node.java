public class Node {
	private int elem;
	private int len;
	private int occurs;

	public Node(int e, int m, int o) {
		elem = e;
		len = m;
		occurs = o;
	}

	public void incLen() {
		len++;
	}

	public void incOccur() {
		occurs++;
	}

	public int getElem() {
		return elem;
	}

	public int getLen() {
		return len;
	}

	public int getOccurs() {
		return occurs;
	}

	public String toString() {
		String s = "Subsequence of length " + len + " consisting of number " + elem + " occurs " + occurs + " times";
		return s;
	}
}