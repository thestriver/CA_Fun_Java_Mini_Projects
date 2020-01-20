package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        //get number of items to be scanned
        System.out.println("How many items would you like to scan?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double total = 0;

        //loop through items, ask for price and add to total
        for (int i = 0 ; i < number ; i++) {
            System.out.println("What's the price of item?");
            double price = scanner.nextDouble();
            total += price ;

        }
        scanner.close();

        System.out.println("Your total cost of your scanned items is $" + total);



    }

}
