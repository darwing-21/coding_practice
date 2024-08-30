package week2.day3;

import java.util.ArrayList;

public class ListElementDifference {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {3, 4, 5, 6};
        System.out.println(findDifference(list1, list2));
    }

    public static ArrayList<Integer> findDifference(int[] list1, int[] list2) {
        ArrayList<Integer> listDifference = new ArrayList<>();
        int i = 0;
        while (i < list1.length || i < list2.length) {
            if (i < list1.length) {
                if (!isExist(list2, list1[i])) {
                    listDifference.add(list1[i]);
                }
            }
            if (i < list2.length) {
                if (!isExist(list1, list2[i])) {
                    listDifference.add(list2[i]);
                }
            }
            i++;
        }
        return listDifference;
    }

    public static boolean isExist(int[] list, int n) {
        boolean isExist = false;
        int i = 0;
        while (i < list.length && !isExist) {
            if (list[i] == n) {
                isExist = true;
            }
            i++;
        }
        return isExist;
    }
}
