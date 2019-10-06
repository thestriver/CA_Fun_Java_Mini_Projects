/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author mahmud
 */
public class newsRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your age, please? ");
        age = scan.nextInt();
        
        if (age < 16 ||age > 59 ) {
            System.out.println("Your rail fare is 120 pounds.");
        } 
        
        else {
            System.out.println("Your rail fare is 150 pounds.");

        }

    }

}
