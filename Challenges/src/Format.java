
public class Format {
	public static void main(String args[]) {
		String align = args[0];
		int chars = Integer.parseInt(args[1]);
		String s = StdIn.readLine();
		int position = chars - 1;
		int start = 0;
		if (align.equals("-l")) {
			while (position < s.length()) {
				if (s.charAt(position) == ' ') {
					s = s.substring(0, position) + "\n" + s.substring(position + 1, s.length());
				} else {
					for (int i = position; i > 0; i--) {
						if (s.charAt(i) == ' ') {
							s = s.substring(0, i) + "\n" + s.substring(i + 1, s.length());
							break;
						}
					}
				}
				position += chars;
			}
			System.out.println(s);
		} else if (align.equals("-r")) {
			while (position < s.length()) {
				if (s.charAt(position) == ' ') {
					s = s.substring(0, position) + "\n" + s.substring(position + 1, s.length());
				} else {
					for (int i = position; i > 0; i--) {
						if (s.charAt(i) == ' ') {
							s = s.substring(0, i) + "\n" + s.substring(i + 1, s.length());
							while (i < position) {
								for (int j = start; j < i; j++) {
									if (s.charAt(j) == ' ' && i < position) {
										j++;
										i++;
										s = s.substring(0, j) + " " + s.substring(j, s.length());
									}
								}
							}
							break;
						}
					}
				}
				position += chars;
				start += chars;
			}
			System.out.println(s);

		} else if (align.equals("-c")) {
			int center = Integer.parseInt(args[2]);
			int extra = 0;
			while (position < s.length()) {
				if (s.charAt(position) == ' ') {
					s = s.substring(0, position) + "\n" + s.substring(position + 1, s.length());
				} else {
					for (int i = position; i > 0; i--) {
						if (s.charAt(i) == ' ') {
							s = s.substring(0, i) + "\n" + s.substring(i + 1, s.length());
							for(int j = 0; j < Math.abs((i - start)/2 -center); j++) {
								s = s.substring(0, start) + " " + s.substring(start, s.length());
							}
							extra = Math.abs((i - start)/2 -center);
							System.out.println(extra);
							break;
						}
					}
				}
				position += chars + extra;
				start += chars + extra;
			}
			System.out.println(s);

		}
	}
}
