package week2.day2;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        int number = 25;
        System.out.println(isPerfect(number));
    }

    public static boolean isPerfect(int n) {
        boolean isPerfect = false;
        if (n >= 0) {
            int squareNumber = (int) Math.sqrt(n);
            isPerfect = squareNumber * squareNumber == n;
        }
        return isPerfect;
    }
}
