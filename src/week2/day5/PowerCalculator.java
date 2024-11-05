package week2.day5;

public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(calculate(2,3));
    }

    public static int calculate(int base, int e) {
        int res = base;
        while (e > 1) {
            res = res * base;
            e--;
        }
        return res;
    }
}
