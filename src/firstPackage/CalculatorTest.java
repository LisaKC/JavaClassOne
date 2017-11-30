package firstPackage;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		char operator;
		double number1, number2, result = 0;
		System.out.println("Enter the operator you wish to use");
		Scanner in = new Scanner(System.in);
		operator = in.next().charAt(0);
		System.out.println("Enter the number1 and number2 respectively");
		number1 = in.nextDouble();
		number2 = in.nextDouble();

		switch (operator) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result = number1 / number2;
			break;
		default:
			System.out.println("Invalid operator");
			break;

		}
		System.out.println("The result is " + result);
	}
}
