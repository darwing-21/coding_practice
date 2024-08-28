package week2.day2;

import java.util.ArrayList;

public class SetDifferenceCalculator {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 10};
        int[] list2 = {3, 4, 5, 6};
        System.out.println(setDifference(list1, list2));
    }

    public static ArrayList<Integer> setDifference(int[] list1, int[] list2) {
        ArrayList<Integer> arrDifference = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (!isExist(list1[i], list2)) {
                arrDifference.add(list1[i]);
            }
        }
        return arrDifference;
    }

    public static boolean isExist(int number, int[] list) {
        boolean isExist = false;
        int i = 0;
        while (i < list.length && !isExist) {
            if (number == list[i]) {
                isExist = true;
            }
            i++;
        }
        return isExist;
    }
}
