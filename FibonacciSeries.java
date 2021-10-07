package week1.day1;
public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 1. I learnt how the for loop and incrementing works from initialization point of view.
	 * 2. Secondly I understood the assignment logics between the variables.
	 * 3. How to interchange the inputs according to our output needs.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)

		// Print first number

		// Iterate from 1 to the range

		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number

		// print sum
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.print("Fibonacci Series:" + firstNum + "," + secNum);
		for (int i = 2; i < range; i++) {
			int sum;
			sum = firstNum + secNum;
			System.out.print("," + sum);
			// System.out.println(sum);
			firstNum = secNum;
			secNum = sum;

		}
	}

}
