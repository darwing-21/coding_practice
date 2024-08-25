package week1.day6;

public class CountElementFrequencyInList {
    public static void main(String[] args) {
        int[] list = {1, 2, 2, 3, 4, 2, 5, 2};
        int element = 2;
        System.out.println(countElementFrequencyInList(list, element));
    }

    public static int countElementFrequencyInList(int[] list, int element) {
        if (list.length > 0) {
            int count = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == element) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }
}
