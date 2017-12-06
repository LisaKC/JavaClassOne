package firstPackage;

public class CheckTheGreatestOfThreeNumbers {

	public static void main(String[] args) {
		// given 3 numbers (a, b, c)

		// sysout (method result)
		System.out.println(whichIsGreatest(2, 6, 9));
	}

	// method to compare numbers against each other

	static int whichIsGreatest(int a, int b, int c) {

		// if (a>b, a>c) return "a"
		if (a > b && a > c) {
			return a;
		}
		// if (b>a, b>c) return "b"
		else if (b > a && b > c) {
			return b;
		}
		// if (c>a, c>b) return "c"
		else {

			return c;
		}
	}

}