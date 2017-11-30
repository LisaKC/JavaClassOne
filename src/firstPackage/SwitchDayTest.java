package firstPackage;
import java.util.Scanner;

public class SwitchDayTest {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number from 1-7 to find the corresponding day of the week");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Number not recognized, follow rules better!");

		}

	}
}
