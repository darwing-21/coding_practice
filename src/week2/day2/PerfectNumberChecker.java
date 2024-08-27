package week2.day2;

import java.util.ArrayList;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(isPerfect(number));
    }

    public static boolean isPerfect(int n) {
        ArrayList<Integer> dividers = findDividers(n);
        int sum = 0;
        for (int i = 0; i < dividers.size(); i++) {
            sum += dividers.get(i);
        }
        return sum == n;
    }

    public static ArrayList<Integer> findDividers(int n) {
        ArrayList<Integer> dividers = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }
}
