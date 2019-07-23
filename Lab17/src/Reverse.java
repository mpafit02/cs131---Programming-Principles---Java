
public class Reverse {
	public static void read() {
		System.out.print("Dwse arithmo: ");
		int n = StdIn.readInt();
		if(n != 0) {
			read();
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		System.out.println("Tha doseis mia seira akeraion arithmon ena-ena.");
		System.out.println("Dwse 0 gia termatismo.");
		read();
	}

}
