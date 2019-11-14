package chapter5;

import java.util.Scanner;


public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
        scan.close();

    }
    //gets salary from scannner
    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();
        return salary;

    }
    //this gets salary from scannner
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scan.nextInt();
        return creditScore;
    }

    //checks if user is qualified then return either a positive or negative boolean
    public static boolean isUserQualified(int creditScore, double salary){
        if (creditScore >= requiredCreditScore && salary >=requiredSalary) {
            return true;

        }
        else {
            return false;

        }	}
    //notifies the user on the status of his credit application
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }	}


}
