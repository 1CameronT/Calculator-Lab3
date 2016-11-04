/**
*Assignment #, Program#
*Date Last Modified:
*
*/

import java.util.Scanner;



/**
 * @author c.toy
 *
 */
public class NewCalculator {

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
		
		double sum=0;
		double product=0;
		double quotient=0;
		double average=0;
		
		
		System.out.print("what is your firstMark? ");
		firstMark = userInput.nextDouble();
		
		System.out.print("what is your secondMark? ");
		secondMark = userInput.nextDouble();
		
		System.out.print("what is your thirdMark? ");
		thirdMark = userInput.nextDouble();
		
		System.out.print("what is your fourthMark? ");
		fourthMark = userInput.nextDouble();
		
		System.out.print("what is your fifthMark? ");
		fifthMark = userInput.nextDouble();
		
		
		sum = firstMark + secondMark + thirdMark + fourthMark + fifthMark;
		product = firstMark * secondMark * thirdMark * fourthMark * fifthMark;
		quotient = firstMark / secondMark / thirdMark / fourthMark / fifthMark;
		
		System.out.println( String.format("Your sum: %10f", sum) );
		System.out.println( String.format("Your product is: %10f", product) );
		System.out.println( String.format("Your quotient is: %10f", quotient) );
		System.out.println( String.format("Your average is: %10f", average) );
		
		
		userInput.close();
	}

}
