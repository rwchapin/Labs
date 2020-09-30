package labs;

public class Lab4 {

	public static void main(String[] args) {
		
		System.out.println(sumLimit(2,3));
		System.out.println(sumLimit(8,3));
		System.out.println(sumLimit(8,1)+ "\n");
		
		
		System.out.println(squirrelPlay(70, false));
		System.out.println(squirrelPlay(95, false));
		System.out.println(squirrelPlay(95, true)+ "\n");
		
		System.out.println(greenTicket(1,2,3));
		System.out.println(greenTicket(2,2,2));
		System.out.println(greenTicket(1,1,2)+ "\n");
		
		System.out.println(countXX("abcxx"));
		System.out.println(countXX("xxx"));
		System.out.println(countXX("xxxx")+ "\n");
		
		System.out.println(stringTimes("Hi",2));
		System.out.println(stringTimes("Hi",3));
		System.out.println(stringTimes("Hi",1));
	}
	/*Write a method for each of the following
	Given 2 non-negative ints, a and b, return their sum, 
	so long as the sum has the same number of digits as a.
	If the sum has more digits than a, just return a without b. 
	Test cases
	sumLimit(2, 3) → 5
	sumLimit(8, 3) → 8
	sumLimit(8, 1) → 9
	*/
	public static int sumLimit(int a,int b) {
		int sum = a + b;
		String sumAsString = sum + "";
		String aAsString = String.valueOf(a);
		if(sumAsString.length() > aAsString.length()) {
			return a;
		}
		return sum;
	}
	
	/*The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). 
	 * Unless it is summer, then the upper limit is 100 instead of 90. 
	 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
	 * Test cases/ squirrelPlay(70, false) → true/ squirrelPlay(95, false) → false/ squirrelPlay(95, true) → true
	 */
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		
		//logic to compare temperature
		if(temp >= 60 && temp <=90) {
			return true;	
		}
		//logic to see if its summer
		if (isSummer = true) {
			return false;
		}
		return false;
			
		
		
	}
	
	/* You have a green lottery ticket, with ints a, b, and c on it. 
	 * If the numbers are all different from each other, the result is 0.
	 * If all of the numbers are the same, the result is 20. 
	 * If two of the numbers are the same, the result is 10.
	 * Test cases
	 * greenTicket(1, 2, 3) → 0
	 * greenTicket(2, 2, 2) → 20
	 * greenTicket(1, 1, 2) → 10
	 */
	public static int greenTicket(int a, int b, int c) {
		int result = 0;
		if(a!=b && b!=c) {
			result = 0;
		}
		else if (a==b && a==c) {
			result = 20;
		}
		else if(a==b | a!=c) {
			result=10;
		}
		
		
		return result;	
	}
	
	/* Count the number of "xx" in the given string. 
	 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 * Test cases
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 */
	
	public static int countXX(String a) {
		int xxCount = 0;
		int index = a.indexOf("xx");
		//formula to find number of xx
		while (index > -1) {
			index = a.indexOf("xx", index + 1);
			xxCount++;	
		}
		return xxCount;
	}
	
	/* Given a string and a non-negative int n, 
	 * return a larger string that is n copies of the original string.
	 * Test cases
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */
	
	public static String stringTimes(String b, int n) {
		String repeat = "";
		for (int i=0; i<n; i++) {
			repeat=repeat + b;
		}
		return repeat;
		
		
		
		
	}



}
