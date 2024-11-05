package week2.day5;

public class GCDCalculator {
    public static void main(String[] args) {
        System.out.println(calculate(49, 14));
    }

    public static int calculate(int num1, int num2) {
        int res = 1;
        if (num1 > 1 && num2 > 1) {
            int i = 2;
            while (i <= num1 && i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    res *= i;
                    num1 /= i;
                    num2 /= i;
                } else {
                    i++;
                }
            }
        } else {
            return -1;
        }
        return res;
    }

}
