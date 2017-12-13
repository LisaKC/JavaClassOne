package strings;
import java.util.Scanner;
public class PasswordPuzzle {

	public static void main(String[] args) {
		System.out.println("Enter Password");
		Scanner in = new Scanner(System.in);
		String password = in.next();

			if (password.length() < 10) {
				System.out.println("Password Length Must Be At Least 10 Characters");
			}else if (isPasswordValid(password) == true) {
				System.out.println("Password is Valid");
			}else if (isPasswordValid(password) == false) {
				System.out.println("Password is Invalid");
			}else {
				System.out.println("I DON'T KNOW WHAT HAPPENED");
			}
		}
	
	
	
	
	public static boolean isPasswordValid(String password) {
		boolean isPasswordValid = true;
		int numberOfDigits = 0;
		
		//convert the string to character array
		char[] charactersInPassword = password.toCharArray();
		
		//for each character in charactersInPassword
		for(char eachChar : charactersInPassword) {
			
			if(!Character.isLetterOrDigit(eachChar)) {
				isPasswordValid = false;
			}
			
			//count number of digits in password
			
			if(Character.isDigit(eachChar)) {
				numberOfDigits++;
			}
			
			
		}
		
		if(charactersInPassword.length < 10 || numberOfDigits < 2) {
			isPasswordValid = false;
		}
		
		return isPasswordValid;
		
	}

		
//	public static boolean checkCharacters(char[] eachCharacterInPassword) {
//		int numberOfDigits=0; 
//		for(int i=0; i<eachCharacterInPassword.length; i++) {
//			if ((eachCharacterInPassword >= 'A' && eachCharacterInPassword<='Z')) {
//				return true;
//			}else if ((eachCharacterInPassword >=0 && eachCharacterInPassword<=9)) {
//				numberOfDigits++;
//				return true;
//			}else if (numberOfDigits > 2){
//				return true;
//			}else {
//				return false;
//			}
//		}
//}
}