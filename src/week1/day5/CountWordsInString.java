package week1.day5;

import java.util.ArrayList;

public class CountWordsInString {
    public static void main(String[] args) {
        String text= "This is a test sentence.";
        System.out.println(countWords(text));
    }

    public static int countWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
