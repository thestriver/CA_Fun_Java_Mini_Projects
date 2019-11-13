package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        /*
         * NESTED IFS:
         * To qualify for a loan, a person must make at least $30,000
         * and have been working at their current job for at least 2 years.
         */
        //what we know
        int reqSalary = 30000;
        int reqDuration = 2;

        //questions
        System.out.println("What's your salary?");
        Scanner scanner = new Scanner(System.in);
        int sal = scanner.nextInt();
        System.out.println("How long have you been working?");
        int term = scanner.nextInt();
        scanner.close();

        //decision
        if (sal >= reqSalary) {
            if ( term >= reqDuration) {
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry you must have worked in the company for " + reqDuration + " years!");
            }

        }
        else {
            System.out.println("Sorry you must be earning at least $" + reqSalary);
        }


    }

}
