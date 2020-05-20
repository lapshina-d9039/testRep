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
	}
	public long computeFibbonacci(long n) {
		
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

}
