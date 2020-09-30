package labs;

public class Lab1 {
	
	public static void main(String [] args) {
		
	int resultMax = max3(5, 23, 9);
	System.out.println("The max number is: " + resultMax);
	
	int resultMin = min3(5, 23, 9);
	System.out.println("The min number is: " + resultMin);
	
	int resultMed = median3(5, 23, 9);
	System.out.println("The median number is: " + resultMed);
	
	boolean resultXOR = xOr(true, false);
	System.out.println("The result is: " + resultXOR);
	
	boolean resultFactor = isFactor(7,28);
	System.out.println("The factor is: " + resultFactor);
	
	boolean resultPerfect = isPerfect(28);
	System.out.println("The number is Perfect: " + resultPerfect);
	
	boolean resultPrime = isPrime(3);
	System.out.println("The number is a Prime: " + resultPrime);
	
	
	
		
	}
	//Write a method called "max3" that computes the maximum value of THREE integers.
	
	public static int max3(int v1, int v2, int v3) {
		
		int max = v1;
		if(v2 > max) {
			max = v2;
			
		}
		if(v3 > max) {
			max = v3;
		}
		return max;
	}
	//Write a method called "min3" that computes the minimum value of THREE Integers. 
	
	public static int min3(int v1, int v2, int v3) {
		int min = v1;
		if(v2 < min) {
			min = v2;
		}
		if(v3 < min) {
			min = v3;
		}
		return min;
		
			
	}
	/*Write a method called "median3" that computes the MEDIAN value of THREE 

    integers. Hint: for the case of three numbers, the median is the value that is

    NOT the maximum NOR the minimum, so add the three values and subtract out

    the min and max, using the methods you wrote for problems #1 and #2.
	 * 
	 */
	public static int median3(int v1, int v2, int v3) {
		//find the total of all 3 integers
		int total3 = v1 + v2 + v3;
		//call the min3 method
		int minV = min3(v1,v2,v3);
		//call the max3 method
		int maxV = max3(v1,v2,v3);
		//formula to find median by using total of all three numbers and subtracting min and max value
		int median = total3 - minV - maxV;
		return median;
		
		
		
	}
	/*Write a method called "xor" that takes two boolean values (either true or false) 

    and returns a boolean value which is true if EITHER of the values is true BUT

    NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where 

    we are excluding the case where both values are true).*/
	
	public static boolean xOr(boolean b1, boolean b2) {
		
		boolean a = b1;
	    boolean b = b2;
	    
	    if(a==b) {
	    	return false;
	    }
	    	return true;
	    
	
	
		
	}
	
	/*Write a method "isFactor" which takes two integers (k and n) and returns true if 
	 * ("if and only if") k is a factor of n.
	 */
	
	public static boolean isFactor (int k, int n) {
		
		
		if(n % k==0) {
			return true;
		}
		return false;
	
	
				
		
		
	}
	
	/*Write a method "isPerfect" which takes an integer and returns true if that 

   integer is a perfect number  Your method MUST call the "isFactor" method you 

   wrote for problem #5.*/
	 

	public static boolean isPerfect(int num) {
		if(num == 0) {
			return false;
		}
		int sumOfFactors = 0;
		for (int i = 1; i < num; i++) {
			if (isFactor(i,num)) {
				sumOfFactors += i; 
			}
			if (sumOfFactors == num) {
				return true;
			}
			
		}
		return false;
	}
		
		
		
	
	
	
	
	/*Write a method "isPrime" which takes an integer and returns true if it is a prime

   number. Your method MUST call the "isFactor" method you wrote for problem #5.
	 * 
	 * 
	 */
	
	public static boolean isPrime(int num) {
		if(num == 0) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if (isFactor(i,num)) {
				return false;
				
			}
		}
		return true;
	}
	

	




}
