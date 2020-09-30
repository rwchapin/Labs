package labs;

import java.util.Scanner;

public class Lab2 {
	
	public static void main(String[] args) {
	//scanner input for radius
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	double radius = input.nextDouble();	
	//result of areaCircle method	
	double resultArea = areaCircle(radius);
	System.out.println("The area of a circle is: " + resultArea);
	//result of circumCircle method
	double resultCircum = circumCircle(radius);
	System.out.println("The circumference of the circle is: " + resultCircum + "\n");
	
	//prompting user for base width input
	System.out.print("Enter the base width of your triangle: ");
	double baseWidth = input.nextDouble();
	//prompting user for height input
	System.out.print("Enter the height of your triangle: ");
	double height = input.nextDouble();
	//result of AreaTriangle method
	double resultTriangle = areaOfTriangle(baseWidth, height);
	System.out.println("The area of your triangle is: " + resultTriangle + "\n");
	
	//prompting user for even or odd number input
	System.out.print("Enter your number to check Even or Odd status: ");
	int evenOddNum = input.nextInt();
	//result of computing even or odd status
	String resultEvenOdd = evenOdd(evenOddNum);
	System.out.println("Your number is: " + resultEvenOdd + "\n");
	
	//prompt user to enter integer to be cast into double
	System.out.print("Enter your number to be converted into decimel: ");
	int numCast = input.nextInt();
	//result of casting number
	double resultCast = cast(numCast);
	System.out.println("You entered " + numCast + ", the new value is " + resultCast + "\n");
	
	//prompt user to enter character to be converted to numeric value
	System.out.print("Please enter a character to be converted to numeric form: ");
	char user = input.next().charAt(0);
	//result of character conversion
	int resultChar = charValue(user);
	System.out.println("Your characters numeric value is: " + resultChar + "\n");
	
	//prompt user to enter number to be rounded
	System.out.print("Enter decimal number to be rounded up or down: ");
	double d = input.nextDouble();
	//result of decimal rounding
	int resultRounding = numRound(d);
	System.out.println("Your rounded number is: " + resultRounding + "\n");
	
	//prompt user to enter year
	System.out.print("Please enter a year: ");
	int year = input.nextInt();
	//true of false result of leap year calculation
	boolean resultLeapYear = leapYear(year);
	System.out.println("Is your entered year a leap year: " + resultLeapYear);
	
	
	
	
	
	
	
	}
	/*Write a method to prompt the user to enter the radius of the circle
	then calculate the area and circumference of the circle.*/
	
	//method to find area of circle
	public static double areaCircle(double radius) {
	
    //formula for area
	double areaOfCircle = 3.14 * radius * radius;
	return areaOfCircle;
	
	}
	//method to find circumference of circle
	public static double circumCircle(double radius) {
		//formula for circumference
		double circum = 3.14 * 2 * radius;
		return circum;
	}
	
	/*Write a method to prompt the user for base-width and height of a triangle,
	  then calculate the area of the Triangle.*/
	
	public static double areaOfTriangle(double baseWidth, double height) {
		double areaTriangle = .5 * baseWidth * height;
		return areaTriangle;
		
	}
	
	//Write a method to prompt the user for a number then display check if the number is Even or Odd.
	 public static String evenOdd(int evenOddNum) {
		 String even = "Even";
		 String odd = "Odd";
		 //calculate even or oddness
		 if(evenOddNum % 2 == 0) {
			 return even;
		 }
		 else {
			 return odd;
		 }
		 
		 
	 }
	 
	 //Write a method to prompt the user for an Integer then display the same value with one decimal place. 
	 //eg. user enter "15 " result is: "You entered 15, the new value is 15.0".
	  public static double cast(int numCast) {
		 
		 double cast = numCast;
		 return cast;
		 
		 
	 }
	 
	 //Write a method to prompt the user for a letter of the alphabet and display it's numerical value.
	 public static int charValue(char user) {
		 int charV = user;
		 return charV;
		 
	 }
	 
	/* Write a method to prompt the user for a double then display the value as a whole number. 
	 eg user enter "15 .8" result is:  "You entered 15.8, the new value is 16".
     eg user enter "15 .4" result is:  "You entered 15.4, the new value is 15".
     */
	 public static int numRound(double d) {
		 //casting double to integer
		 int i = (int) d;
		 //subtracting whole number from double to get decimal
		 double sum = d - i;
		 //logic statement to round up or down
		 if (sum <= 0.5) {
			 return i;	 
		 }
		 else if (sum >= 0.5) {
			 i++;
		 }
		 
		 return i;
			 
		 
	 }
	 
	 /*Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.

	 How to determine whether a year is a leap year
	 To determine whether a year is a leap year, follow these steps:
	 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
	 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
	 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
	 4. The year is a leap year (it has 366 days).
	 5. The year is not a leap year (it has 365 days).
	 */
	 public static boolean leapYear(int year) {
		 if(year % 4 == 0) {
			 return true;
		 
		 }
		 if (year % 100 == 0) {
			 return true;
			 
		 }
		 if (year % 400 == 0) {
			 return true;
			 
		 }
		 return false;
	 }
	 

	
		


}
