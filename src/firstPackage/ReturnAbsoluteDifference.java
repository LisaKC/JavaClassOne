package firstPackage;

public class ReturnAbsoluteDifference {

	public static void main(String[] args) {
		// given int(n)
		// find ABSOLUTE difference b/w n-21
		// if (n>21), return difference*2

		System.out.println(absoluteDifference(-20));
	}

	static int absoluteDifference(int n) {
		int result;
		if (n > 21) {
			//return 2 * Math.abs(n-21);
			Math.abs(n);
			result = 2 * (n - 21);
			return result;
		} else {
			Math.abs(n);
			result = 21 - n;
			return result;
		}
	}
}
