package firstPackage;

public class LoudTalkingParrotTrouble {

	public static void main(String[] args) {
		// PARAMETER: hour(0<23)
		// PARAMETER: parrotTalking(true||false)
		// RETURN: trouble
		// TROUBLE(true) if: parrotTalking(true) hour(0<7||20<23)

		System.out.println("It is " + hourParrotTalks(true,10) + " that we are in trouble.");
	}

	static boolean hourParrotTalks(boolean isTalking,int hour) {
		if (isTalking && hour < 7 || hour > 20) {
			return true;
		} else {
			return false;
		}
	}
}
