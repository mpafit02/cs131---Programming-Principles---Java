
public class MostDivisors {

	public static void main(String[] args) {
		int divisors = 3, maxDivisors = 3, maxNum = 2;
		long startTime = System.currentTimeMillis();
		for(int num = 2; num <= 10000; num+=2) {
			if ((num % 8 == 0)&&(num % 4 == 0)) {
			for(int di = 2; di < num/2; di++) {
				if (num % di == 0) 
					divisors++;
				}
				if(divisors >= maxDivisors) {
					maxDivisors = divisors;
					maxNum = num;
				}
				divisors = 3;
			}
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("O Arithmos me tous perisoterous dieretes einai " + maxNum + " me " + maxDivisors + " diairetes.");
		System.out.println("O Kodikas ektelestike se " + duration + " milliseconds. ");
	}

}
