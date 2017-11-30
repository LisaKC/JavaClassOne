package firstPackage;
import java.util.Scanner;

public class ReduceIdElsePosNeg {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if (x < 0 || x > 0 || x == 0) {
			System.out.println("negative");
		}
		{
			System.out.println("positive");
		}
		{
			System.out.println("invalid");
		}
	}

}
