
public class CapitalizeStrings {
	public static void printCapitalized(String str) {
		String nStr = "";
		char chr = Character.toUpperCase (str.charAt(0));
		for(int i = 1; i < str.length(); i++) {
			nStr += chr;
			if ((!Character.isLetter(str.charAt(i-1)))&&(Character.isLetter(str.charAt(i)))) {
				chr = Character.toUpperCase (str.charAt(i));
			}else {
				chr = str.charAt(i);
			}
		}
		System.out.println(nStr);
	}
	public static void main(String[] args) {
		System.out.print("Say something: ");
		String str = StdIn.readLine();
		printCapitalized(str);
	}

}
