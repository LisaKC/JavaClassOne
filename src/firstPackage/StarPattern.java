package firstPackage;

public class StarPattern {

	public static void main(String[] args) {
		int x, y;

		for (x = 1; x <= 10; x++) {
			for (y = x; y > 0; y--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
