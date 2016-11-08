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
		
		
		average = (firstMark + secondMark + thirdMark + fourthMark + fifthMark )/ 5;
		
		System.out.println( String.format("Mark 1: %10f", firstMark) );
		System.out.println( String.format("Mark 2: %10f", secondMark) );
		System.out.println( String.format("Mark 3: %10f", thirdMark) );
		System.out.println( String.format("Mark 4: %10f", fourthMark) );
		System.out.println( String.format("Mark 5: %10f", fifthMark) );
		System.out.println( String.format("Average: %10f", average) );
		
		
		userInput.close();
	}

}
