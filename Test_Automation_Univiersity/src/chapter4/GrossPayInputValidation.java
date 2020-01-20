package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {
        /*
         * WHILE LOOP:
         * Each store employee makes $15 an hour. Write a program that allows the employee
         * to enter the number of hours worked for the week. Do not allow overtime.
         */

        //initialize known variables
        int rate = 15;
        int maxHours = 40;

        //get unknown
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //loop
        while(hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Sorry, your hours must not exceed 40 hours and be below 1 hour. Input a correct number");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //gross pay
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay is $" + grossPay);




    }
}
