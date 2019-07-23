
public class Histogram {
	public static void nl() {
		System.out.println();
	}

	public static void line(int n, char c) {
		for (int i = 1; i <= n; i++) {
			System.out.print(c);
		}
	}

	public static int max(int[] table) {
		int res = table[0];
		for (int i = 1; i < table.length; i++) {
			if (table[i] > res) {
				res = table[i];
			}
		}
		return res;
	}

	public static int min(int[] table) {
		int res = table[0];
		for (int i = 1; i < table.length; i++) {
			if (table[i] < res) {
				res = table[i];
			}
		}
		return res;
	}

	public static boolean positives(int[] table) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] > 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean negatives(int[] table) {
		for (int i = 0; i < table.length; i++) {
			if (table[i] < 0) {
				return true;
			}
		}
		return false;
	}

	public static void UHist(int[] tab) {
		int top = max(tab);
		int bottom = min(tab);
		for(int i = top; i >= 0; i--) {
			if(i != 0) {
				for(int j = 0; j < tab.length; j++) {
					if(i == tab[j]) {
						if(i > 0) {
							System.out.print("*");
							tab[j]-=1;
						}
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int j = 0; j < tab.length; j++) {
				System.out.print("-");
				}
			}
			nl();
		}
		for(int i = 0; i >= bottom; i--) {
				for(int j = 0; j < tab.length; j++) {
					if((tab[j] < 0)&&(i >= tab[j])) {
						System.out.print('+');						
					}else {
						System.out.print(" ");						
					}
			}
			nl();
		}
	}

	public static void VHist(int[] tab) {
		int bottom = -min(tab);
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] > 0) {
				line(bottom,' ');
				System.out.print("|");
				line(tab[i],'*');
				nl();
			}else if (tab[i] <= 0){
				line(bottom + tab[i],' ');
				line(-tab[i],'+');
				System.out.println("|");
			}
		}
	
	}
	public static void main(String[] args) {
		if (args.length == 0)
			System.out.print("\n\nNo Data given\n\n");
		else {
			int[] table = new int[args.length];
			for (int i = 0; i < table.length; i++) {
				table[i] = Integer.parseInt(args[i]);
			}
			VHist(table);
			nl();
			nl();
			UHist(table);
			nl();
			nl();
		}

	}

}
