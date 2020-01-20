package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean foundLetter = false;

        //loop through to check
        for (int i = 0 ; i < text.length(); i++) {
            char eachLetter = text.charAt(i);
            if (eachLetter == 'A' || eachLetter == 'a' ) {
                foundLetter = true;
                break;

            }
        }

        if(foundLetter) {
            System.out.println("Letter A was found in the text");
        }
        else {
            System.out.println("Letter A wasn't found in the text");
        }


    }

}
