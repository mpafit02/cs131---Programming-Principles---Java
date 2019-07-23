public class Anagram {
	public static final int WORDNUM = 6;

	public static int occurs(String s, char c) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				sum++;
			}
		}
		return sum;
	}

	public static boolean anagram(String w1, String w2) {
		boolean common = true;
		if (w1.length() != w2.length()) {
			return false;
		} else {
			for (int i = 0; i < w1.length(); i++) {
				char c = w1.charAt(i);
				for (int j = 0; j < w2.length(); j++) {
					if (w2.charAt(j) == c) {
						if (occurs(w1, c) != occurs(w2, c)) {
							common = false;
						}
					}
				}
			}
			return common;
		}
	}

	public static int ReadWords(String[] Words) {
		int i = 0;
		while (i < WORDNUM) {
			Words[i] = StdIn.readString();
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		String[] Words = new String[WORDNUM];
		int num = ReadWords(Words);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i != j) {
					if (anagram(Words[i], Words[j])) {
						System.out.println(Words[i] + "  =  " + Words[j]);
					}
				}
			}
		}
	}
}