package finalExam;

import java.util.Scanner;

public class FinalExam {
	
	public static void main(String[] args) {
		//run the first question
		System.out.println("Question one, here we go! Press Enter");
		//get enter key input from user
		Scanner in1 = new Scanner(System.in);
		String input1;
		input1=in1.nextLine();
		if(input1.equals("")) {
		icyHot();
		}
		
		//getting ready for the next method
		System.out.println("\n" + "Question two! Feeling Lucky? Press Enter");
		//get enter key input from user
		Scanner in2 = new Scanner(System.in);
		String input2;
		input2=in1.nextLine();
		if(input2.equals("")) {
			sum13();
		}
		
		System.out.println("\n" + "\n" + "Final question! Press Enter");
		//get enter key input from user
		Scanner in3 = new Scanner(System.in);
		String input3;
		input3=in3.nextLine();
		if(input3.equals("")) {
			firstTwo();
		}
		System.out.println("\n" + "\n" + "Gooooooooooo Java!!");
	}
	
		
//QUESTION ONE
//Write pseudo code and execute the following program:
//Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//EXAMPLE:
// icyHot(120, -1) → true
// icyHot(-1, 120) → true
// icyHot(2, 120) → false

	//create method
		public static void icyHot() {
			
			//create two variables (temperature input)
			//give them variable names temp1 and temp2
			int temp1, temp2;
			
			//request input from user
			System.out.println("Enter two temperatures");
			
			//receive input from user, using Scanner
			Scanner in = new Scanner(System.in);
			
			//use input as value for variables "temp1" and "temp2"
			temp1 = in.nextInt();
			temp2 = in.nextInt();
			
			//check for extreme temperatures
			System.out.println("Extreme temperatures?");
			
			//if temp1 is less than 0 AND temp2 is greater than 100, return true
			if (temp1 < 0 && temp2 > 100) {
					System.out.println("true");
			}  
			//if temp1 is greater than 100 AND temp2 is less than 0, return true
			else if (temp1 > 100 && temp2 < 0) {
				System.out.println("true");
			}  
			//otherwise, just return false
			else {
				System.out.println("false");
			}
		}

//QUESTION TWO
//Write pseudo code and execute the following programs:
//Return the sum of the numbers in the array, returning 0 for an empty array. 
//Except the number 13 is very unlucky, so it does not count 
//and numbers that come immediately after a 13 also do not count.
//Example:
//sum13({1, 2, 2, 1}) → 6
//sum13({1, 1}) → 2
//sum13({1, 2, 2, 1, 13}) → 6
		
		//create method
		public static void sum13() {
			
			//create array
			int array[] = {1, 2, 2, 1};
			//declare and initiate the sum variable - must have value of 0 to start!
			int sum = 0;
			
			//advanced for loop (for each number in the array)
			for (int number : array) {
			//nested if condition to check if the number is 13 -  if so, break	
			if (number == 13) {
				break;
			}
			//otherwise, just add that number to the sum
			else {
				sum = sum + number;
				}
		}
			//print the sum
		System.out.print(sum);
	}
		
			
//QUESTION THREE
//Given a string, return the string made of its first two chars, so the String
//"Hello" yields "He". If the string is shorter than length 2, return whatever
//there is, so "X" yields "X", and the empty string "" yields the empty string
//"". Note that str.length() returns the length of a string.
//Example:
// firstTwo("Hello") → "He"
// firstTwo("abcdefg") → "ab"
// firstTwo("ab") → "ab"
			
		public static void firstTwo() {
			
		//ask the user for a word (string)
		System.out.println("Enter a word");
		
		//take the users input to create string object
		Scanner in = new Scanner(System.in);
		
		//declare and initiate string object, use input from user
		String string = in.nextLine();
		
		//create an if loop that performs a function on string with more than 2 characters
		if(string.length()>2) {
			//using substring, grab first 2 characters (include index, exclude index)
			System.out.print(string.substring(0, 2));
		} 
		//if word is 2 characters or less, just return it
		else {
			System.out.println(string);
		}
	}
		
//complete that class body, baby
}		