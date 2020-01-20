package chapter7;

import java.util.Arrays;
import java.util.Random;

public class ticketPrinter {

    private static final int LENGTH = 6;
    private static final int MAX_NUMBERS = 69;

    public static void main(String[] args) {
        int[] ticket =  generateNumbers();
        Arrays.sort(ticket);
        printNumbers(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random  random = new Random();

        for (int i = 0; i < LENGTH ; i++) {
            int randomNumber;

            //checking if generated number doesn't come up twice
            do {
                randomNumber = random.nextInt(MAX_NUMBERS) + 1 ;
            }while (search(ticket, randomNumber)); //true if its there

            ticket[i] = randomNumber ;
        }
        return ticket;

    }

    /**
     * sequential search on the array to check if number randomly generated exist before
     * @param array
     * @return
     */

    public static boolean search(int[] array , int numberToBeSearched) {
        for (int value : array) {
            if (value == numberToBeSearched) {
                return true;
            }
        }

        return false; //i.e not there;

    }


    /*  binary search equivalent
    public static boolean search(int[] array, int numberToBeSearched) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToBeSearched);
        if (index >= 0) {
            return  true;
        }
        else {
            return false;
        }


    }
     */

    public  static void printNumbers(int[] ticket) {
        for (int i = 0; i < LENGTH ; i++) {
            System.out.print(ticket[i] + "|");
        }
    }






}
