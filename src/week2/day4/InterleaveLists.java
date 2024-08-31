package week2.day4;

import java.util.ArrayList;

public class InterleaveLists {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        char[] list2 = {'a', 'b', 'c', 'd'};
        System.out.println(interleaveLists(list1, list2));
    }

    public static ArrayList<String> interleaveLists(int[] list1, char[] list2) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < list1.length || i < list2.length) {
            if (i < list1.length) {
                list.add(String.valueOf(list1[i]));
            }
            if (i < list2.length) {
                list.add(String.valueOf(list2[i]));
            }
            i++;
        }
        return list;
    }
}
