
public class ReverserVersion1{
	
	public static void main(String[] args){
		int[] data = {11,25,43,4,15,96,78,18,9,30,71,42,13,64};
		// reverse the data
		int temp;
		for ( int i=0; i < data.length/2; i++)
		{
			temp = data[data.length - 1 - i];
			data[data.length - 1 - i] = data[i];
			data[i] = temp;
		}
		// print the reversed data
		for ( int j=0; j < data.length; j++)
		{
			System.out.print(data[j] + " ");
		}
	}
} 