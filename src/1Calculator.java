/**
* 
*Name
*Assignment #, Program#
*Date Last Modified:
*
*/

import java.util.Scanner;



/**
 * @author c.toy
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner userInput = new Scanner(System.in);
		
		double firstMark = 0;
		double secondMark = 0;
		double thirdMark = 0;
		double fourthMark =0;
		double fifthMark =0;
		
		double sum;
		double difference;
		double product;
		double quotient;
		
		sum = firstMark + secondMark + thirdMark + fourthMark + fifthMark;
		difference = firstMark - secondMark - thirdMark - fourthMark - fifthMark;
		product = firstMark * secondMark * thirdMark * fourthMark * fifthMark;
		quotient = firstMark / secondMark / thirdMark / fourthMark / fifthMark;
		
		
		System.out.println( String.format("Your sum: %10f", sum) );
		System.out.println( String.format("Your difference: %10f", difference) );
		System.out.println( String.format("Your product is: %10f", product) );
		System.out.println( String.format("Your quotient is: %10f", quotient) );
		
		userInput.close();
	}

}
