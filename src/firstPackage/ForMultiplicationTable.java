package firstPackage;

import java.util.Scanner;

public class ForMultiplicationTable {

	public static void main(String[] args) {
		int number, i;
		System.out.print("Enter number");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();

		for (i = 1; i < 11; i++)
			System.out.println(i * number);

	}

}
