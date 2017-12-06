package firstPackage;

public class ReturnExampleTwo {
	static int computeSize(int height, int width) {
		return height * width;

	}

	public static void main(String[] args) {

		int result = computeSize(10, 3);
		System.out.println(result);

	}

}
