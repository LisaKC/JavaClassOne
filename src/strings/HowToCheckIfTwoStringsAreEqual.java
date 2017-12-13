package strings;

public class HowToCheckIfTwoStringsAreEqual {
	public static void main(String[] args) {
	String name1 = "Lisa";
	String name2 = "Lisa";
	String name3 = new String("Lisa");
	
	if (name1 == name2) {
		System.out.println("== does not check " + "if string object contents are the same");
	} else if (name2 == name3) {
		System.out.println("this will not print");
	}

}
}