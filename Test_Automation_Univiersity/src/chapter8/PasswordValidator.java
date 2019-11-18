package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    private static Scanner scanner = new Scanner(System.in);
    private static String password = scanner.next();

    public static void main(String[] args) {

        passwordValidator(password);
    }

    public static void passwordValidator(String text) {
        /* at least 8 characters long ; contain an uppercase letter; contain a special character ; not contain a username ; not the same as old password
        * */
        String username = ""; String oldPassword = "";

        if (password.contains(username)) {
            System.out.println("Please try another password besides your username");
        }
        else if (password.contains(oldPassword)) {
            System.out.println("Please try another password besides your old password");
        }
        else if (password.length() < 8) {
            System.out.println("Please make your password at least 8 characters long");
        }
        else if (password.contains("a")

        for (int i = 0; i < password.length() ; i++) {
           StringBuilder newPassword = new StringBuilder(password);
            if (Character.isUpperCase(newPassword.charAt(i))) {
                                            }

        }


    }
}
