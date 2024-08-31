package week2.day4;

import java.util.ArrayList;

public class CountUniqueWords {
    public static void main(String[] args) {
        String text = "this is a test this is only a test";
        System.out.println(countUniqueWords(text));
    }

    public static int countUniqueWords(String text) {
        ArrayList<String> list = new ArrayList<>();
        String element = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!isExist(list, element)) {
                    list.add(element);
                }
                element = "";
            } else {
                element += text.charAt(i);
            }
        }
        if (!element.isEmpty() && !isExist(list, element)) {
            list.add(element);
        }
        return list.size();
    }

    public static boolean isExist(ArrayList<String> list, String text) {
        boolean isExist = false;
        int i = 0;
        while (!isExist && i < list.size()) {
            if (list.get(i).equals(text)) {
                isExist = true;
            }
            i++;
        }
        return isExist;
    }

}
