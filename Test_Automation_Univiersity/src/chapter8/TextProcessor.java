package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
    }

    public static void countWords(String text) {
        var words =  text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("The words contain %d number of words:", numberOfWords);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }

    }
}
