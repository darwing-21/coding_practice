package week2.day1;

public class FindMinimumInList {

    public static void main(String[] args) {
        int[] list = {3, 5, 1, 9, 2};
        System.out.println(findMinimumElement(list));
    }

    public static int findMinimumElement(int[] list) {
        int minimun = list[0];
        for (int j : list) {
            if (minimun > j) {
                minimun = j;
            }
        }
        return minimun;

    }

}
