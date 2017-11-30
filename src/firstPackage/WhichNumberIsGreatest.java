package firstPackage;
import java.util.Scanner;

public class WhichNumberIsGreatest {

	public static void main(String[] args) {
		int a, b, c, d, e;
		System.out.println("Enter five DIFFERENT numbers");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		if (a > b && a > c && a > d && a > e) {
			System.out.println("The greatest number is " + a);
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("The greatest number is " + b);
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("The greatest number is " + c);
		} else if (d > a && d > b && d > c && d > e) {
			System.out.println("The greatest number is " + d);
		} else if (e > a && e > b && e > c && e > d) {
			System.out.println("The greatest number is " + e);
		} else {
			System.out.println("Error! Follow directions better");
		}
	}

}
