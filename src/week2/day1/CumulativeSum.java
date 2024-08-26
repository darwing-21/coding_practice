package week2.day1;

import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(returnListCumulativeSum(list)));
    }

    public static int[] returnListCumulativeSum(int[] list) {
        int[] listCumulative = new int[list.length];
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
            listCumulative[i] = sum;
        }
        return listCumulative;
    }
}
