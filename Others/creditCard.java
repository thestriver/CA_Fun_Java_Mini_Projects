/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3loopsandarrays;
//import java.util.Scanner;
/**
 *
 * @author 19038521
 */
public class creditCard {

    public static void main(String[] args) {

        // remove dash and space from credit card number input
       // Scanner scan = new Scanner (System.in);
        //System.out.println("Please input your card number");
        //String creditNo = scan.nextLine();
        String creditNo = "4123-5678-9012-3450";
        int i = 0;
        
        while (i < creditNo.length()) {
            char ch = creditNo.charAt(i);
            if (ch == ' ' || ch == '-' ) {
               String before = creditNo.substring(0,i);
               String after = creditNo.substring(i + 1);
               creditNo = before + after ;
           
            }
            else {
                i++ ;
            }
            
        }
        
        System.out.println(creditNo);
         
    }
}


 