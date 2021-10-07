package week1.day1;

public class PrimeNumber {

	/*
	 * 
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * 
	 * 
	 * input: 13
	 * 
	 * output: 13 is a Prime Number
	 * 
	 * 
	 * 
	 * Shortcuts:
	 * 
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow
	 * + enter
	 * 
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down
	 * arrow + enter
	 * 
	 * 
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) I have learnt different logics using conditional statements & jumping statements
	 * 
	 * 2) Secondly understood the concept of boolean and handling the flag correctly
	 * 
	 * 3)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		// Declare a boolean variable flag as false

		// Iterate from 2 to half of the input

		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator

		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match

		int input = 17;
		boolean flag = false;
		for (int i = 2; i < input / 2; i++) {
			// System.out.println("Print i: "+i);
			if (input % i != 0) {
				flag = true;
			} else {
				flag = false;
				break;

				// System.out.println("Prime");
			}
		}
		System.out.println("flag value: " + flag);
		if (flag == true) {
			System.out.println(input+" is a Prime number");
		} else {
			System.out.println(input+" is not a Prime number");
		}

	}
}
