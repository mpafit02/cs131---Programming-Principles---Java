
public class Hex2Dec {

	public static int hexValue(char chr) {
		int val;
		switch (chr) {
		case '0':
			val = 0;
			break;
		case '1':
			val = 1;
			break;
		case '2':
			val = 2;
			break;
		case '3':
			val = 3;
			break;
		case '4':
			val = 4;
			break;
		case '5':
			val = 5;
			break;
		case '6':
			val = 6;
			break;
		case '7':
			val = 7;
			break;
		case '8':
			val = 8;
			break;
		case '9':
			val = 9;
			break;
		case 'a':
		case 'A':
			val = 10;
			break;
		case 'b':
		case 'B':
			val = 11;
			break;
		case 'c':
		case 'C':
			val = 12;
			break;
		case 'd':
		case 'D':
			val = 13;
			break;
		case 'e':
		case 'E':
			val = 14;
			break;
		case 'f':
		case 'F':
			val = 15;
			break;
		default:
			val = -1;
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.print("Give a Hex number: ");
		String str = StdIn.readString();
		int value = 0;
		for (int i = 0; i < str.length(); i++)
			value = value * 16 + hexValue(str.charAt(i));
		System.out.println("The number is equal to: " + value);
	}

}
