
public class LongestPlateauProblem2 {

	public static void main(String[] args) {
		int table[] = {10, 7, 7, 9, 9, 9, 9, 9, 5,5,5,5,5,5,5, 2, 2,10,10,10,10, 2, 7, 5, 5, 1};
		int plateau = table[0];
		
		int maxPlithos = 1;
		int plithos = 1;
		for(int i = 1; i < table.length - 2; i++) {
			if(table[i-1] < table[i]) {
				int j = i;
				while(table[j+1]==table[j]) {
					plithos++;
					j++;
				}
				if(table[j+1] < table[j]) {
					if (plithos >= maxPlithos) {
						maxPlithos = plithos;
						plateau = table[j];
					}
				}
			}
			plithos = 1;
		}
		
		System.out.print( "To plateau me to megalitero mikos einai to: [");
		for(int i = 0; i < maxPlithos; i++) {
			if (i == maxPlithos - 1) {
				System.out.print( plateau + "]");
			}else {
				System.out.print( plateau + ",");
			}
		}

	}

}
