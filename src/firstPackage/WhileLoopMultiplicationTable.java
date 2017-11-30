package firstPackage;

import java.util.Scanner;

public class WhileLoopMultiplicationTable {

	public static void main(String[] args) {
		int number, result, i = 10;

		System.out.println("Enter number");

		Scanner in = new Scanner(System.in);
		number = in.nextInt();

		while (i >= 1) {
			result = i * number;
			System.out.println(result);
			i--;
		}
	}

}
