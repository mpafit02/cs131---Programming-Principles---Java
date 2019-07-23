import java.util.Scanner;
public class MathimtikesPrakseis {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Dose mian mathimatiki praksi: ");
		double num1 = stdin.nextDouble();
		String operator = stdin.next();
		//char op = operator.charAt(0);
		double num2 = stdin.nextDouble();
		double result = 0;
		boolean correct = true;
		switch(operator) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
		case "/" :
			result = num1 / num2;
			break;
			
		default:
			correct = false;
		}
		if(correct) {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}else {
			System.out.println("Wrong Input!");
		}
		stdin.close();
	}

}
