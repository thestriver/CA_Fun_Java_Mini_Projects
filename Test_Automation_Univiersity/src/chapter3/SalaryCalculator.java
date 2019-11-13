package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    /*
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

    public static void main(String[] args) {
        //known values
        int salary = 1000;
        int bonus = 250;
        int bonusTrigger = 10;

        //get values
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        //compare

        if(number >= bonusTrigger) {
            System.out.print("You qualify for the bonus. You will be paid $" + (salary+bonus));
        }
        else {
            System.out.println("Sorry, you don't qualify for the bonus. Your pay is $" + salary);
        }

    }


}
