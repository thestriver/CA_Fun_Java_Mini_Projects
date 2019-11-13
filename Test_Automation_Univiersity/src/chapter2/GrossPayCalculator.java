package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1. Get the number of hours worked
        System.out.println("How many numbers do you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("What's the hourly pay rate?");
        double rate = scanner.nextDouble();
        //3. Multiply hours and pay rate
        double grossPay = rate * hours ;

        //4. Display result
        System.out.println("The gross pay is $" + grossPay);

        scanner.close();
    }

}
