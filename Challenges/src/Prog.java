public class Prog {
	public static String[] Fn(String[] as, String[] bs) {
		int N = as.length + bs.length;
		String[] rs = new String[N];
		for (int i = 0; i < as.length; i++)
			rs[i] = new String(as[i]);
		for (int i = as.length; i < N; i++)
			rs[i] = new String(bs[i - as.length]);
		return rs;
	}

	public static String[] Fn(String s) {
		if (s.length() == 0) {
			String[] xs = new String[1];
			xs[0] = new String("");
			return xs;
		} else {
			String[] xs = Fn(s.substring(1, s.length()));
			String[] ys = new String[xs.length];
			for (int i = 0; i < ys.length; i++) {
				ys[i] = new String(xs[i]);
				ys[i] = ys[i].concat(s.substring(0, 1));
			}
			return Fn(xs, ys);
		}
	}

	public static void main(String[] args) {
		String[] ss = Fn(args[0]);
		for (int i = 0; i < ss.length; i++)
			System.out.println("ss-" + i + " = " + ss[i]);
	}
}
