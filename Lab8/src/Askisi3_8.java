
public class Askisi3_8 {
	public static void main(String[] args) {
		int t[] = {-1,2,3,1,2,0,9,0,10,-1,2,49,-20,10,9};
		int sum = 0;
		for(int i = 0; i < t.length; i++) {
			if ((t[i] == -1)||(t[i] > 0)) {
				sum++;
				System.out.print(t[i] + " ");
			}
		}
		System.out.println("\n" + sum);
	}

}
