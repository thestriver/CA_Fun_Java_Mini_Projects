package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
        //createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {   //or just use (Exception e) which is the parent exception class
            System.out.println("Non-existent directory!");
            e.printStackTrace();
        }

    }
    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();


    }

    public static void numbersExceptionHandling() {
        File file = new File("numbers.txt");
        Scanner fileReader = null;
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }



}

