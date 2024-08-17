package week1.day2;

import java.util.ArrayList;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        int[] listWithDuplicate = {1, 2, 3, 2, 4, 1};
        ArrayList<Integer> listWithoutDuplicate = removeDuplicate(listWithDuplicate);
        System.out.println(listWithoutDuplicate);
    }

    public static ArrayList<Integer> removeDuplicate(int[] list) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++) {
            if (!isDuplicate(output, list[i])) {
                output.add(list[i]);
            }
        }
        return output;
    }

    public static boolean isDuplicate(ArrayList<Integer> list, int n) {
        boolean isDuplicate = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
}
