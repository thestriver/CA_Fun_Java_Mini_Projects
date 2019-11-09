/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author p0073862
 */
public class NoughtCrossStart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare and intitialise the board
        char[][] board = new char[3][3];

        // initialise all the elements to '.' we use this to indicate that a 
        // square is empty, because a space character would not be visible
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '.';
            }
        }

        //The first player is X
        char thisPlayer = 'X';
        boolean finished = false;
        while (!finished) {
            //Display the board
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    System.out.print(board[row][col]);
                }
                System.out.println();
            }

            // Ask the user where to place the next character
            System.out.println("Character to be placed is " + thisPlayer);
            System.out.print("Enter the row at which you wish to place it> ");
            int placeRow = scanner.nextInt();
            System.out.print("Enter the column at which you wish to place it> ");
            int placeCol = scanner.nextInt();
            board[placeRow][placeCol] = thisPlayer;

            // If the last character placed was 'X' then the next must be 'O'
            // and vice versa
            thisPlayer = (thisPlayer == 'X') ? 'O' : 'X';
            
            if (board.length == 9) {
                finished = false; //return flase
            }
            
            else if (placeCol < 0 || placeCol > 2) {
                finished = false;
            }
            else if(placeRow < 0 || placeRow > 2 ) {
                finished = false;
            }
            
            else {
                finished = true;
            } 
            
        }
        
        





    }
}