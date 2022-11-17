package SecondComputerScienceAssignmentMethodsAndTriangleVerification;

import java.util.Scanner;

public class AssignmentMethodsTriangleClassification {

	public static void main(String[] args) {
		
		Scanner MethodBasics = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		do 
		{
			System.out.println("\n\nPlease enter three side lengths of a triangle: "
					+ "\n(Please note that entering a value that does not equal "
					+ "\na triangle will terminate the program.)");
			a = MethodBasics.nextDouble();
			b = MethodBasics.nextDouble();
			c = MethodBasics.nextDouble();
			
			
			if (isFinished(a, b, c))
				
			{
				System.out.println("Program is Terminated! O.O have a good day!");
			}
			if (TriangleOrNo(a, b, c))
			{
				System.out.println("Uh Oh! The three values you entered do not equal a triangle!"
									+ "\nThe program is terminated. Please run again!");
			}
			
			else 
			{
				displayValues(a, b, c);
				System.out.println(sideClassificationOfTheTriangle(a, b, c));
				System.out.println(angleClassificationOfTheTriangle(a, b, c));
			}
		} while (!isFinished(a, b, c) || !TriangleOrNo(a, b, c));	
	}
	
/* The Following Program:
* Checks to see if the user has entered the termination numbers (0, 0, 0). If they have, 
* it will return 'true'. If they have not is will return 'false'.
* */

		public static boolean isFinished (double a, double b, double c)
		{
			boolean zeros = false;
			zeros = (a == 0 && b == 0 && c == 0);
			
			if (zeros == false)
			{
				return zeros;
			}
			else
			{
				return true;
			}
		}
		

	
/*The Following Program:
* Checks to see whether the three double variables a, b, and c create a triangle.
* If they do, they will return 'true', if not, it will return 'false'.
* 
*/
		
		public static boolean TriangleOrNo (double a, double b, double c)
		{
			double AngleRadian1;
			double AngleRadian2;
			double AngleRadian3;
			
			double AngleTest1;
			double AngleTest2;
			double AngleTest3;
			
			double totalAngleDegrees;
			
			AngleRadian1 = (Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b)));
			AngleRadian2 = (Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2 * a * c)));
			AngleRadian3 = (Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2))/(2 * c * b)));
			
			AngleTest1 = toDecimal(AngleRadian1);
			AngleTest1 = Math.round(AngleTest1);
			
			AngleTest2 = toDecimal(AngleRadian2);
			AngleTest2 = Math.round(AngleTest2);
			
			AngleTest3 = toDecimal(AngleRadian3);
			AngleTest3 = Math.round(AngleTest3);
			
			totalAngleDegrees = (AngleTest1 + AngleTest2 + AngleTest3);
			

			if (totalAngleDegrees == 180)
			{
				return false;
			}
			else
			{
				return true;
			}
			
			
		}
			
/*The Following Program:
 * Converts the angles/values from radians to angles.
 * 
 * Source: https://www.geeksforgeeks.org/program-convert-radian-degree/
 * 
 */
		
		public static double toDecimal (double radian)
		{
			double pi = 3.14159;
	        return(radian * (180/pi));
		}
			
	
/*The Following Program:
 *Determines whether the three values double 'a', 'b', and 'c' form a:
 *–Scalene
 *–Right Triangle
 *–Isoceles
 *–Equilateral Triangle
 *Using the side lengths of the triangle to classify it.
 *
 *Note: randomVariable =–𝑐2+𝑎2+𝑏2−(cos-1)2𝑎𝑏 for the right angle test.
 * */
	
	public static String sideClassificationOfTheTriangle (double a, double b, double c)
	{ 	
		String scalene = "The side classification of your triangle is scalene. ";
		String rightTriangle = "The classification of your triangle is a right angle triangle.";
		String isoceles = "The side classification of your triangle is an isoceles.";
		String rightIscoeles = "The classification of your triangle is a right angle and isoceles.";
		String equilateral = "The classification of your triangle is an equilateral triangle.";
		
		double AngleRadian1;
		double AngleRadian2;
		double AngleRadian3;
		double AngleTest1;
		double AngleTest2;
		double AngleTest3;
		
		AngleRadian1 = (Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b)));
		AngleRadian2 = (Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2 * a * c)));
		AngleRadian3 = (Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2))/(2 * c * b)));
		
		AngleTest1 = toDecimal(AngleRadian1);
		AngleTest1 = Math.round(AngleTest1);
		
		AngleTest2 = toDecimal(AngleRadian2);
		AngleTest2 = Math.round(AngleTest2);
		
		AngleTest3 = toDecimal(AngleRadian3);
		AngleTest3 = Math.round(AngleTest3);
		

		
		System.out.println(AngleTest1);
		System.out.println(AngleTest2);
		System.out.println(AngleTest3);
		
		if ((AngleTest1 == 90 || AngleTest2 == 90 || AngleTest3 == 90) 
			&& 
		   (AngleTest1 == AngleTest2 || AngleTest1 == AngleTest3 || AngleTest2 == AngleTest3))
		{
			return rightIscoeles;
		}
		if (AngleTest1 == 90 || AngleTest2 == 90 || AngleTest3 == 90)
		{
			return rightTriangle;
		}
		if (AngleTest1 == 60 && AngleTest2 == 60 && AngleTest3 == 60)
		{
			return equilateral;
		}
		else 
		{
			if (AngleTest1 == AngleTest2 || AngleTest1 == AngleTest3 || AngleTest2 == AngleTest3)
			{
				return isoceles;
			}
			else 
			{
				return scalene;
			}
		}
	}

/*
 *The Following Program:
 *Determines whether the three values double 'a', 'b', and 'c' form a:
 *	–Obtuse
 *	–Acute
 *	–Right 
 *Using the angle lengths of the triangle to classify it.  
 * */	
	
	public static String angleClassificationOfTheTriangle (double a, double b, double c)
	{
		String obtuse = "The angle classification of your triangle is obtuse.";
		String acute = "The angle classification of your triangle is an actue.";
		String neither = " ";
		
		double AngleRadian1;
		double AngleRadian2;
		double AngleRadian3;
		double AngleTest1;
		double AngleTest2;
		double AngleTest3;
		
		AngleRadian1 = (Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b)));
		AngleRadian2 = (Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2 * a * c)));
		AngleRadian3 = (Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2))/(2 * c * b)));
		
		AngleTest1 = toDecimal(AngleRadian1);
		AngleTest1 = Math.round(AngleTest1);
		
		AngleTest2 = toDecimal(AngleRadian2);
		AngleTest2 = Math.round(AngleTest2);
		
		AngleTest3 = toDecimal(AngleRadian3);
		AngleTest3 = Math.round(AngleTest3);
		
		if ((AngleTest1 < 90 && AngleTest2 < 90 && AngleTest3 < 90) && (a != b && a != c && c != b))
		{
			return acute;
		}
		if (AngleTest1 > 90 || AngleTest2 > 90 || AngleTest3 > 90)
		{
			return obtuse;
		}
		else
		{
			return neither;
		}
		
	}
	
/*
 * Note for Later: You cannot display the types of triangle the way you want in a new method
 * you would have to do it in the main, because you cannot call a return value, because it 
 * only returns to the main, and not to other methods.
 * 
 * 
 * */
	
	public static void displayValues (double a, double b, double c)
	{
		System.out.println("The values you entered are: (" + a + ", " + b + ", " + c + ")");
	}

}

		
