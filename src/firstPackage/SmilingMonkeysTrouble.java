package firstPackage;

public class SmilingMonkeysTrouble {

	public static void main(String[] args) {

		// given two monkeys: (a, b)
		if (monkeyTrouble(false, true)) {
			System.out.println("We are in trouble... MONKEY trouble!");
		} else {
			System.out.println("No monkey trouble here!");
		}
	}
	// two parameters: aSmile and bSmile
	// aSmile = true; monkey is smiling
	// bSmile = true; monkey is smiling
	// (a/bSmile = true/false); there is trouble
	// monkeyTrouble(true, true); == monkeyTrouble(true) == both monkeys smiling
	// monkeyTrouble(false, false); == monkeyTrouble(true) == both monkeys !smiling
	// else monkeyTrouble(false)

	static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		//if(aSmile == bSmile)
		//return true;
		if (aSmile == true && bSmile == true) {
			return true;
		} else if (aSmile == false && bSmile == false) {
			return true;
		} else {
			return false;
		}
	}

}
