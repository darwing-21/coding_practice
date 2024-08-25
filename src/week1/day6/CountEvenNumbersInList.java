package week1.day6;

public class CountEvenNumbersInList {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 10, 20};
        System.out.println(countEvenNumerInList(list));
    }

    public static int countEvenNumerInList(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
