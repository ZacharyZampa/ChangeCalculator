/* Name: Zachary Zampa
 * Date Created: 09/19/2018
 * Filename: ChangeCalculator.java
 * Description: Calculate change required for a cashier.
 * Two inputs- amount due and amount recieved from customer
 * Displays- dollars, quarters, dimes, nickels, and pennies
 * a customer gets back all in a two column list
 * User - supply both amounts in pennies
 **/

import java.util.Scanner; // import java scanner

public class ChangeCalculator {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in); // set up keyboard
      // set up variables
      int dollars, quarters, dimes, nickels, pennies, due, received, given, tmp;
      final int DOLLARS, QUARTERS, DIMES, NICKELS, PENNIES;
      DOLLARS = 100;
      QUARTERS = 25;
      DIMES = 10;
      NICKELS = 5;
      PENNIES = 1;        
      // Ask user for information
      System.out.print("What is the amount due? ");
      due = keyboard.nextInt(); // enter how much is due
      keyboard.nextLine(); // clear extra input
      System.out.print("How much did the customer pay? ");
      received = keyboard.nextInt(); // enter how much is received
      keyboard.nextLine(); // clear extra input
      // calc how much to give to customer
      given = received - due;
      if (due > received)  // ensure customer payed full amount or exit program
      {
         System.out.println("Please have custumer pay in full, then use program");
         System.exit(0);
      }
      
      // begin if statements / coin sorting   
      if (given == 0) // exact change
      {
       System.out.println("No change owed");  
      }
      if (given >= DOLLARS) // more than $1
      {
         dollars = given / DOLLARS;
         System.out.printf("Dollars: %7d", dollars);
         System.out.println(); // line separator
         given = given % DOLLARS;
      }
      if (given >= QUARTERS) // more than $0.25
      {
         quarters = given / QUARTERS;
         System.out.printf("Quarters: %6d", quarters);
         System.out.println(); // line separator
         given = given % QUARTERS;
      }
      if (given >= DIMES) // more than $0.10
      {
         dimes = given / DIMES;
         System.out.printf("Dimes: %9d", dimes);
         System.out.println(); // line separator
         given = given % DIMES;
      }
      if (given >= NICKELS) // more than $0.05
      {
         nickels = given / NICKELS;
         System.out.printf("Nickels: %7d", nickels);
         System.out.println(); // line separator
         given = given % NICKELS;
      }
      if (given >= PENNIES) // more than $0.01
      {
         pennies = given / PENNIES;
         System.out.printf("Pennies: %7d", pennies);
         System.out.println(); // line separator
      }
      keyboard.close(); // close scanner
   } // end main method
}