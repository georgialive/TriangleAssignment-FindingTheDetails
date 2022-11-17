package SecondComputerScienceAssignmentMethodsAndTriangleVerification;

import java.util.Scanner;

public class AssesmentTwoNumbers {

	public static void main(String[] args) {
		
		Scanner MethodBasics = new Scanner(System.in);
		double a;
		double b;
		
		
		do 
		{
			System.out.println("\n\nPlease eneter two integers:  (Please "
					+ "\nnote that entering two zeros will end the program.)");
			a = MethodBasics.nextDouble();
			b = MethodBasics.nextDouble();
			
			
			if (isFinished(a, b))
				
			{
				System.out.println("Program is Terminated! O.O have a good day!");
			}
			
			else 
			{
				displayValues(a, b);
			}
		} while (!isFinished(a, b));	
	}
	
/*The Following Program:
 *Determining which value of integer a and b is smaller and returns the smaller value 
 * */
	
	public static double min (double a, double b)
	{
	if (a > b)
	{
		return b;
	}
	else
	{
		return a;
	}
	
	}
/*The Following Program:
*Determining which value of integer a and b is larger and returns the larger value
* */
	
	public static double max (double a, double b)
	{
		if (a < b)
		{
			return b;
		}
		else
		{
			return a;
		}
		
	}

/* The Following Program:
 * Checks to see if the user has entered the termination numbers (0,0). If they have, 
 * it will return 'true'. If they have not is will return 'false'.
 * */

	public static boolean isFinished (double a, double b)
	{
		boolean zeros = false;
		zeros = (a == 0 && b == 0);
		return zeros;
	}
/*
 * Uses the max() and min() methods to determine the maximum and minimum values, and then
 * displays the values for the user.
 * */
	
	public static void displayValues (double a, double b)
	{
		System.out.println("User input is: (" + a + "," + b + ")");
		System.out.print("\nThe minimum value is: " + min(a, b));
		System.out.print("\nThe maximum value is: " + max(a, b));
		
	}
	
	
}
