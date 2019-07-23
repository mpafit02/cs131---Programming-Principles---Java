
public class Askisi2 {

	public static void main(String[] args) {
		double averMagnitude = 1;
		double averPower = 1;
		double sum = 0, sumP = 0;;
		int times = 1;
		int zeroCross = 0;
		while (!StdIn.isEmpty()) {
			double num = StdIn.readDouble();
			sum += Math.abs(num);
			sumP += Math.pow(num, 2);
			if(num < 0) {
				zeroCross++;
			}
			times++;
		}
		averMagnitude = sum / times;
		averPower = sumP / times;
		System.out.printf("Average Magnitude: %.2f\nAverage Power: %.2f\nZero Crossings: %d\n",averMagnitude,averPower,zeroCross);
	}

}
