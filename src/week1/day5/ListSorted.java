package week1.day5;

public class ListSorted {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(isSortedList(list));
    }

    public static boolean isSortedList(int[] list) {
        boolean isSorted = true;
        int num = list[0];
        int i = 1;
        while (isSorted && i < list.length) {
            if (num <= list[i]) {
                num = list[i];
            } else {
                isSorted = false;
            }
            i++;
        }
        return isSorted;
    }
}
