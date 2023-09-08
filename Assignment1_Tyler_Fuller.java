/*
 * Assignment1_Tyler_Fuller
 * Tyler_Fuller
 * 01261802
 * 09/06/2023
 */

import java.util.*; // Import Scanner to get user input

public class Assignment1_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define PI as constant
		final double PI = 3.14159;
		
		// Define variables
		double radius, length, area, volume;
		
		// Prompt user for radius and length values (e.g. 5.5 12.1)
		System.out.print("Enter the radius and length of a cynlinder: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		length = input.nextDouble();
		input.close();
		
		// Compute area and volume
		area = radius * radius * PI;
		volume = area * length;
		
		// Print results to console
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
	}
}