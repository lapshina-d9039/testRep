import java.util.Scanner;

/**
 * 
 */

/**
 * @author lapsh
 *
 */
public class AppForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Number to get a Fibbonacci of:");
		long calc = input.nextLong();
		long result = computeFibbonacci(calc);
		long resultRec = computeRec(calc);
		System.out.println("The Fibbonacci of " + calc + " is: " +result +" or recursively " + resultRec );
		input.close();
	}
	public static long computeFibbonacci(long n) {
		
		// if input is negative - throw exception
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		// initialize fields for result and previous number
		long result = 1;
		long previousFib = 1;
	
		// fibonacci of 0 and 1
		if (n <= 1) {
			return n;
		}
		// start loop at 2, until less than n
		for (int i = 2; i < n; i++) {
			// set temp to the current partial result
			long temp = result;
			// add the previous number to the result
			result += previousFib;
			// reassign the previous to the temp (step to the next number)
			previousFib = temp;

		}
		return result;
	}
	public static long computeRec(long n) {
		// if input is negative - throw exception
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		// increase number of calls
		
		// base cases for 0 and 1
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		// recursive case
		else
			// call the method with two previous values
			return computeRec(n - 1) + computeRec(n - 2);

	}

}
