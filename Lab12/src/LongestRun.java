
public class LongestRun {

	public static void main(String[] args) {
		int max = 1;
		int previous = StdIn.readInt(); 
		int maxCommon = previous; 
		int times = 1;
		while (!StdIn.isEmpty()) {
			int num = StdIn.readInt();
			if(num == previous) {
				times++;
			}else {
				if (times >= max) {
					max = times;
					maxCommon = previous;
					}
				times = 1;
			}
			previous = num;
		}
		System.out.println("Longest run: " + max + " consecutive " + maxCommon + "s.");
	}

}
