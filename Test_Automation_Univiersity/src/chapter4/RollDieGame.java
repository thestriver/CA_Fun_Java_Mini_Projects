package chapter4;

import java.util.Random;

public class RollDieGame {
    public static void main(String[] args) {

        //init known
        int spaces = 20;
        int rolls = 5;
        Random random = new Random();
        //boolean check = false;
        int space = 0;
        //loop five times

        for (int i = 0; i < rolls ; i++) {
            int die = random.nextInt(6) + 1;
            space += die;
            if (space == spaces) {
                System.out.println("You're on space 20. You've won");
                break;
            }
            else if (space > spaces) {
                System.out.println("Sorry. You're past the 20 spaces. You lose. Try again");
                break;
            }
            else if (i == rolls && space < spaces) {
                System.out.println("Sorry. You lose because you've exhausted the number of rolls and still not at last space.");
            }
            else {
                System.out.println("Roll #:" + (i+1) + " You've rolled a " + die + ". You're now on space " + space + " and have " + (spaces-space)+  " more to go");
            }

        }



    }
}

/*
 while(check) {
            for (int i = 0; i < rolls ; i++) {
                int die = random.nextInt(6) + 1;
                space = die;
                System.out.println("Roll #:" + (i+1) + " You've rolled a" + die + ". You're now on space" + space + " and have" + (spaces-space)+  "more to go");
                space += die;
                if (space == spaces) {
                    System.out.println("You're on space 20. You've won");

                    check = true;
                }
                else if (space > spaces) {
                    System.out.println("Sorry. You lose. Try again");
                    check = true;
                }

            }
            if (space < spaces) {
                System.out.println("Sorry. You lose. Try again");
            }

        }
 */