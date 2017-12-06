package firstPackage;

public class CheckIfNumberIsPositiveOrNegative {

	public static void main(String[] args) {

		System.out.println(isNumberPositiveOrNegative(-9));

	}

	// method to check if number is positive or negative
	// if >0 is positive
	// return number is positive
	// if <0 is negative
	// return number is negative
	// if ==0 return neither positive nor negative
	static String isNumberPositiveOrNegative(int num) {
		if (num == 0) {
			return "neither positive nor negative";
		} else if (num > 0) {
			return "Number is postive";
		} else {
			return "Number is negative";
		}
	}

}
