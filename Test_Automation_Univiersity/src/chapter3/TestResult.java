package chapter3;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        /*
         * IF-ELSE-IF
         * Display the letter grade for a student based on their test score.
         */
        // get test score
        System.out.println("What's you test score?");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();
        //determine letter grade
        if (score >= 70) {
            System.out.println("Your grade is A");
        }
        else if (score >= 60) {
            System.out.println("Your grade is B");
        }
        else if (score >= 50) {
            System.out.println("Your grade is C");
        }
        else if (score >= 45) {
            System.out.println("Your grade is D");
        }
        else if (score >= 40) {
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("Your grade is F");
        }


    }
}
