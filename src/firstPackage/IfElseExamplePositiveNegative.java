package firstPackage;
import java.util.Scanner;

public class IfElseExamplePositiveNegative {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if (x < 0) {
			System.out.println("negative number");
		} else if (x > 0) {
			System.out.println("positive number");
		} else {
			System.out.println("number is invalid");

		}
	}
}
