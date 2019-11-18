package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again;
        do {
            System.out.println("Input the first number");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            System.out.println("Input the second number");
            double num2 = scanner.nextDouble();
            //add
            double sum = num1 + num2;
            System.out.println("The sum of the two numbers is " + sum);

            System.out.println("Wanna play the game again?");
            again = scanner.nextBoolean();

        }
        while (again);


    }
}
