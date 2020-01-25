package chapter7;

import java.util.Scanner;

public class Grades {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] grades;

    public static void main(String[] args) {
        System.out.println("How many grades do you want to enter?");
<<<<<<< HEAD
        grades = new int[scanner.nextInt()]; //scans for next grade
=======
        grades = new int[scanner.nextInt()];
>>>>>>> eb428968b59a5e7232cd887c60877e5b46508a65
        getGrades();
        System.out.println("Average is " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest value is " + getHighest());
        System.out.println("Lowest value is " +getLowest());

    }

    public static void getGrades() {
        for (int i = 0; i < grades.length ; i++) {
            System.out.print("Type in the grade for #" + (i+1));
            grades[i] = scanner.nextInt();

        }
    }

    public static int calculateTotal() {
        int sum = 0;
        for(int grade:grades) {
            sum+= grade;
        }
        return sum;

    }
    public static double calculateAverage() {
        return calculateTotal()/grades.length;

    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade:grades) {
            if(grade > highest) {
                highest = grade;
            }
        }
        return highest;

    }

    public static int getLowest() {
        int lowest = grades[0];
        for(int grade:grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }



}
