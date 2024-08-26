package week2.day1;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(reverseList(list));
    }

    public static ArrayList<Integer> reverseList(int[] list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = list.length - 1; i >= 0; i--) {
            newList.add(list[i]);
        }
        return newList;
    }
}
