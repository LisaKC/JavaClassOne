package firstPackage;

public class OddEvenAssignment {

	public static void main(String[] args) {

		for (int x = 0; x < 11; x++) {
			System.out.print(x + " - ");

			if (x == 0) {
				System.out.println("Neither Odd nor Even");
			} else if (x % 2 == 0) {
				System.out.println("Even");
			} else if (x % 2 == 1) {
				System.out.println("Odd");
			}

		}

	}
}
