package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private String username;

    private String oldPassword;
    private boolean valid;
    private String errorMsg;

    private static Scanner scanner;
    private String password;

    public static void passwordRules() {
        System.out.println("The password must be at least eight characters long, " +
                "contain an uppercase letter, contain a special character, " +
                "not contain the username and not be the same as the old password.");
    }


    public boolean isValid() {
        return valid;
    }

    public String notifyErrorMsg() {
        return errorMsg;
    }

    public void scannerClose() {
        scanner.close();
    }

    public static void main(String[] args) {
        passwordRules();
        //login();
        //passwordValidator();
    }

    public void passwordValidator(String text) {
        /* at least 8 characters long ; contain an uppercase letter; contain a special character ; not contain a username ; not the same as old password
        * */
        this.username = username;
        this.password = password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your username");

        username = scanner.next();
        System.out.println("What's your username");
        scanner = new Scanner(System.in);
        password = scanner.next();

        valid = true;
        errorMsg = "";

        if (password.contains(username)) {
            valid = false;
            errorMsg += "Please try another password besides your username";
        }
        if (password.contains(oldPassword)) {
            valid = false;
            errorMsg += "Please try another password besides your old password";
        }
        if (password.length() < 8) {
            valid = false;
            errorMsg += "Please make your password at least 8 characters long";
        }
        if(password.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMsg += "\n Your password must include a special character (e.g. %,$[:).";
        }
        if(password.equals(password.toLowerCase())) {
            errorMsg += "\n Your password must include a uppercase letter";

        }


    }
}
