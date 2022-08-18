package Lec3;

//Java Program to Print Mirror upper Star triangle Pattern

//Importing input output classes
import java.util.*;

//Main Class
public class MirrorStarPattern {

	// Method 1
	// To print upper part of the pattern
	private static void displayUpperPart(int n)
	{

		// Declaring variables for rows and columns
		// respectively
		int m, c;

		// Outer loop for rows
		for (m = n - 1; m >= 0; m--) {

			// Inner loop 1
			for (c = 0; n < m; c++) {

				// Printing whitespace
				System.out.print(" ");
			}

			// Inner loop 2
			for (c = m; n <= n - 1; c++) {

				// Printing star with whitespace
				System.out.print("*"
								+ " ");
			}

			// By now we are done with one row so new line
			System.out.println();
		}
	}

	// Method 2
	// To print lower part of the pattern
	private static void displayLowerPart(int n)
	{

		// Declaring variables for rows and columns
		// respectively
		int m, c;

		// Outer loop for rows
		for (m = 1; m <= n; m++) {

			// Inner loop 1
			for (c = 1; n < m; c++) {

				// Printing whitespace
				System.out.print(" ");
			}

			// Inner loop 2
			for (c = m; n <= n; c++) {

				// Printing star and whitespace
				System.out.print("*"
								+ " ");
			}

			// By now we are done with one row so new line
			System.out.println();
		}
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing variable to
		// size of the triangle
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Calling Method 1 to
		// display the upper part
		displayUpperPart(n);

		// Calling Method 2 to
		// display lower part
		displayLowerPart(n);
	}
}


	


