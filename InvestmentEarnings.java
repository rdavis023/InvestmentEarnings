import java.util.Scanner;
import java.text.*;
/*The purpose of this code is to calculate investment earnings per buying and closing of shares.
 * It utilizes the scanner method by asking the user to enter buying price and so forth. It takes
 * a while loop to allow the int instance variable to increment 1 for each day. Then takes the double,
 * the user inputs and goes through an if/else statement to calculate the amount gained or lost. 
**/

public class InvestmentEarnings {

	public static void main(String[] args) {
		//Scanner Object
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		double buyingPrice = scnr.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		DecimalFormat df = new DecimalFormat("0.00"); //object used to call the casting of a decimal
		
		//while loop
		while (true) {
			System.out.println("Enter the closing price for day " + day + " (any negative value to leave: ");
			closingPrice = scnr.nextDouble();
			//if statement used to check for non-negative number
			if(closingPrice < 0.0) break;
			double earnings = closingPrice - buyingPrice;
			if(earnings > 0) {
				System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
			}
			else if (earnings < 0.0) {
				System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
			}
			else {
				System.out.println("After day" + day + ", you have " + "no earnings per share.");
			}
			day +=1;
		}
		scnr.close();
	}

}
