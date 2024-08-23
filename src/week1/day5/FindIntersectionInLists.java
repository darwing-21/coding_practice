package week1.day5;

import java.util.ArrayList;

public class FindIntersectionInLists {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {3, 4, 5, 6};
        System.out.println(findIntersectionInLists(list1, list2));
    }

    public static ArrayList<Integer> findIntersectionInLists(int[] list1, int[] list2) {
        ArrayList<Integer> intersectionList = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if (isElementExists(list2, list1[i])) {
                intersectionList.add(list1[i]);
            }
        }
        return intersectionList;
    }

    public static boolean isElementExists(int[] list, int num) {
        boolean isExists = false;
        int i = 0;
        while (!isExists && i < list.length) {
            if (list[i] == num) {
                isExists = true;
            }
            i++;
        }
        return isExists;
    }
}
