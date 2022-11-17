package SecondComputerScienceAssignmentMethodsAndTriangleVerification;

import java.util.Scanner;

public class AssesmentThreeNumbers {

	public static void main(String[] args) {
		
		Scanner MethodBasics = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		do 
		{
			System.out.println("\n\nPlease enter three integers:  (Please "
					+ "\nnote that entering two zeros will end the program.)");
			a = MethodBasics.nextDouble();
			b = MethodBasics.nextDouble();
			c = MethodBasics.nextDouble();
			
			
			if (isFinished(a, b, c))
				
			{
				System.out.println("Program is Terminated! O.O have a good day!");
			}
			
			else 
			{
				displayValues(a, b, c);
			}
		} while (!isFinished(a, b, c));	
	}
	
/*The Following Program:
 *Determining which value of doubles 'a', 'b' and 'c' is smaller and returns the smaller value 
 * */
	
	public static double min (double a, double b, double c)
	{
		if (a < b && a < c)
		{
		return a;
		}
		if (b < a && b < c)
		{
		return b;
		}
		else
		{
		return c;
		}
	}
/*
 * The Following Program:
 * Determines the middle value of doubles a, b, and c and returns the middle value. 
 * */	
	
	public static double mid (double a, double b, double c)
	{
		if (a < b && a > c)
		{
			return a;
		}
		if (a > b && a < c)
		{
			return a;
		}
		if (b < a && b > c)
		{
			return b;
		}
		if (b > a && b < c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
/*The Following Program:
*Determining which value of double 'a', 'b' and 'c' is larger and returns the larger value
* */
	
	public static double max (double a, double b, double c)
	{
		if (a > b && a > c)
		{
			return a;
		}
		if (b > a && b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
		
	}

/* The Following Program:
 * Checks to see if the user has entered the termination numbers (0,0, 0). If they have, 
 * it will return 'true'. If they have not is will return 'false'.
 * */

	public static boolean isFinished (double a, double b, double c)
	{
		boolean zeros = false;
		zeros = (a == 0 && b == 0 && c == 0);
		return zeros;
	}
/*
 * Uses the max() and min() methods to determine the maximum and minimum values, and then
 * displays the values for the user.
 * */
	
	public static void displayValues (double a, double b, double c)
	{
		System.out.println("User input is: (" + a + ", " + b + ", " + c + ")");
		System.out.print("\nThe minimum value is: " + min(a, b, c));
		System.out.print("\nThe maximum value is: " + max(a, b, c));
		System.out.print("\nThe middle value is: " + mid(a, b, c));
		
	}

}
