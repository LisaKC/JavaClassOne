package firstPackage;

public class WhileLoopPrintTheseNumbers {

	public static void main(String[] args) {

		int i = 1;

		while (i < 16) {
			if (i == 3 || i == 7 || i == 8 || i == 15) {
				System.out.println(i);
			}

			i++;
		}
	}
}
