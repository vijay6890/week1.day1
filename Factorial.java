package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5 output: 5*4*3*2*1 = 120
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code? 1) 2) 3)
		 * Learnt iterator in better way alongside of assigning the right values in right place. This is my first java program.
		 */ 

		// Declare your input as 5

		// Declare an integer variable fact as 1

		// Iterate from 1 to your input (tip: using loop concept)

		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)

		// End of loop

		// Print factorial (fact)

		int input = 5;
		int fact = 1;

		for (int i = fact; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
