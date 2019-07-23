
public class LongestPlateauProblem {

	public static void main(String[] args) {
		int table[] = {3, 7, 7, 9, 5, 2, 2, 2, 7, 5, 5, 1};
		int times = 1;
		int plateau = table[0];
		int maxTimes = 1;
		for (int i  = 0; i < table.length - 1; i++) {
			if(table[i+1] == table[i]) {
				times++;
			}else{
				if (times > maxTimes) {
					maxTimes = times;
					plateau = table[i];
					times = 1;
				}
			}
		}
		
		for(int i = 0; i < maxTimes; i++) {
			if (i == maxTimes - 1) {
				System.out.print( plateau + "]");
			}else if (i == 0){
				System.out.print( "To plateau me to megalitero mikos einai to: ["+ plateau + ",");
			}else {
				System.out.print( plateau + ",");
			}
		}

	}

}
