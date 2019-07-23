
public class TruthTable {

	public static void main(String[] args) {
		boolean x = false, y = false, result1, result2;
		System.out.println("x\ty\tresult1\tresult2");
		System.out.println("-------------------------------");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				result1 = !(x || y);
				result2 = !x && !y;
				System.out.println(x + "\t" + y + "\t" + result1 + "\t" + result2);
				y = true;
			}
			x = true;
			y = false;
		}
	}

}
