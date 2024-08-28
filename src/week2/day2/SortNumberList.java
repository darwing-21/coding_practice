package week2.day2;

import java.util.Arrays;

public class SortNumberList {
    public static void main(String[] args) {
        int[] list = {3, 1, 4, 1, 5, 9, 5, 8, 5, 3, 5, 55, 5};
        System.out.println(Arrays.toString(sortList(list)));
    }

    public static int[] sortList(int[] list) {
        if (list.length > 0) {
            boolean isChanges;
            do {
                isChanges = false;
                for (int i = 0; i < list.length - 1; i++) {
                    if (list[i] > list[i + 1]) {
                        int aux = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = aux;
                        isChanges = true;
                    }
                }
            } while (isChanges);
        }
        return list;
    }
}
