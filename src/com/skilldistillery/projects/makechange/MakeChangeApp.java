package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In the cash register we will calculate the amount of change returned to a
		 * customer based on the purchase price and the amount tendered. We will also
		 * notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1,
		 * .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change
		 * should be provided using the largest bill and coin denominations as possible.
		 * Denominations that are not used should not be displayed.
		 * 
		 */
		// Add scanner
		Scanner sc = new Scanner(System.in);
		double totalAmount, amountPaid;
		int amountOwed;
		// user story 1
		System.out.println("Enter total amount: ");
		totalAmount = sc.nextDouble();
		// user story 2
		System.out.println("Enter amount paid: ");
		amountPaid = sc.nextDouble();

		double changeToConvert = amountPaid - totalAmount;

		amountOwed = (int) (changeToConvert) * (100);
		// change is exact or not enough money
		if (amountOwed < 0) {
			System.out.println("Insufficient funds. Please provide additional money.");
		} else if (amountOwed == 0) {
			System.out.println("Exact change. Thank you!!");
		} else {
			makeChange(amountOwed);
		}

		System.out.println("Change total: $" + (amountOwed/100));

	}

	public static void makeChange(int change) {
		int twentiesOwed, tensOwed, fivesOwed, onesOwed;
		int quartersOwed, dimesOwed, nicklesOwed, penniesOwed;
		
		twentiesOwed = change / 2000;
		change = change % 2000; 
		System.out.println(twentiesOwed + " twenties");
		
		tensOwed = change / 1000;
		change = change % 1000;
	    System.out.println(tensOwed + " tens");
	    
	    fivesOwed = change / 500;
	    change = change % 500;
	    System.out.println(fivesOwed + " fives");
	    
	    onesOwed = change / 100;
	    change = change % 100;
	    System.out.println(onesOwed + " ones");
	    
	    quartersOwed = change / 25;
	    change = change % 25;
	    System.out.println(quartersOwed + " quarters");
	    
	    dimesOwed = change / 10;
	    change = change % 10;
	    System.out.println(dimesOwed +" dimes");
	    
	    nicklesOwed = change / 5;
	    change = change % 5;
	    System.out.println(nicklesOwed + " nickles");
	    
	    penniesOwed = change / 1;
	    change = change % 1;
	    System.out.println(penniesOwed + " pennies");
	     
	}

}
