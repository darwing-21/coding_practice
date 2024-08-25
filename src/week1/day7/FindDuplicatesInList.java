package week1.day7;

import java.util.ArrayList;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 4, 5, 5, 6, 7, 10, 7};
        System.out.println(findDuplicates(list));
    }

    public static ArrayList<Integer> findDuplicates(int[] list) {
        ArrayList<Integer> withoutDuplicates = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int j : list) {
            if (isDuplicate(withoutDuplicates, j)) {
                duplicates.add(j);
            } else {
                withoutDuplicates.add(j);
            }
        }
        return duplicates;
    }

    public static boolean isDuplicate(ArrayList<Integer> list, int n) {
        boolean isDuplicate = false;
        if (!list.isEmpty()) {
            int i = 0;
            while (!isDuplicate && i < list.size()) {
                if (list.get(i) == n) {
                    isDuplicate = true;
                }
                i++;
            }
        }
        return isDuplicate;
    }
}
