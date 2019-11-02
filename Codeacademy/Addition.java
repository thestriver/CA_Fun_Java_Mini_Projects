/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import java.util.Scanner;
/**
 *
 * @author 19038521
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int firstNum = scan.nextInt();
        System.out.print("Enter another number > ");
        int secondNum = scan.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of your numbers is " + sum);
        
    }
    
}
