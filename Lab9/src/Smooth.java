public class Smooth {
 public static void main ( String[] args ){
 int[] signal = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
 int[] smooth = new int[signal.length];
 // compute the smoothed value for each
 // cell of the array smooth
 smooth[0] = (int)((signal[0] + signal[1])/2);
 smooth[signal.length-1] = (int)((signal[signal.length-1] + signal[signal.length-2])/2);
 
 for (int i = 1; i < signal.length - 1; i++) {
	 smooth[i] = (int)((signal[i - 1] + signal[i] + signal[i + 1])/3);
 }

 // write out the input
 System.out.print("signal: ");
 for ( int j=0; j < signal.length; j++) {
	 System.out.print(signal[j] + " ");
 }

 // write out the result
 System.out.print("\nsmooth: ");
 for ( int j=0; j < smooth.length; j++) {
	 System.out.print(smooth[j] + " ");
 }
 }
} 