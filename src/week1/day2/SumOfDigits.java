package week1.day2;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int n) {
        int output = 0;
        while (n > 0) {
            output += n % 10;
            n = n / 10;
        }
        return output;
    }
}
