package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        //init known
        int studentNumbers = 24;
        int textNumbers = 4;
        Scanner scanner = new Scanner(System.in);


        //loop through  number of students
        for (int i = 0; i < studentNumbers ; i++) {
            double total = 0;

            //loop through numbers of text
            for (int j = 0; j < textNumbers ; j++) {
                System.out.println("Whats your score for  text #?" + (j+1) );

                double score = scanner.nextDouble();
                total += score;
            }

            //getting average
            double average = total/textNumbers;
            System.out.println("The average score for student #"+ (i+1) + "is " + average );
        }

        scanner.close();
    }
}
