
public class RomanNumbers {

	public static void main(String[] args) {
		String roman = StdIn.readString();
		int num = 0;
		if (roman.substring(roman.length() - 2, roman.length()).equals("IV")) {
			num += 4;
			roman = roman.substring(0, roman.length() - 2);
		} else if (roman.substring(roman.length() - 2, roman.length()).equals("IX")) {
			num += 9;
			roman = roman.substring(0, roman.length() - 2);
		} else {
			while (roman.contains("I")) {
				num += 1;
				roman = roman.substring(0, roman.length() - 1);
			}
		}
		if (roman.contains("V")) {
			num += 5;
			roman = roman.substring(0, roman.length() - 1);
		}
		while (roman.contains("X")) {
			num += 10;
			roman = roman.substring(0, roman.length() - 1);
		}

		System.out.println(num);
	}

}
