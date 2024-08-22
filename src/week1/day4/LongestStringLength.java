package week1.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestStringLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        System.out.println(calculateStringMaxLength(list));
    }

    public static int calculateStringMaxLength(ArrayList<String> list) {
        int output = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > output) {
                output = list.get(i).length();
            }
        }
        return output;
    }
}
