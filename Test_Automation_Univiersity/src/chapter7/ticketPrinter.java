package chapter7;

import java.util.Random;

public class ticketPrinter {

    private static final int LENGTH = 6;
    private static final int MAX_NUMBERS = 69;

    public static void main(String[] args) {
        int[] ticket =  generateNumbers();
        printNumbers(ticket);

    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random  random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBERS) + 1 ;

        for (int i = 0; i < LENGTH ; i++) {
            ticket[i] = randomNumber;
        }
        return ticket;

    }

    public  static void printNumbers(int[] ticket) {
        for (int i = 0; i < LENGTH ; i++) {
            System.out.print(ticket[i] + "|");
        }
    }





}
