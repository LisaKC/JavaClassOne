package firstPackage;
import java.util.Scanner;

class AddNumbers {
	public static void main(String args[]) {
		int x, y, z, a, b, c;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		a = x - y;
		b = x * y;
		c = x / y;
		System.out.println("Sum of entered integers = " + z);
		System.out.println("Difference of entered integers = " + a);
		System.out.println("Product of entered integers = " + b);
		System.out.println("Quotient of entered integers = " + c);
	}

}
