package week1.day1;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrimo = isPrimo(number);
        System.out.println(isPrimo);
    }

    public static boolean isPrimo(int number) {
        int dividers = countDividers(number);
        return dividers == 2;
    }

    public static int countDividers(int number) {
        int dividers = 2;
        if (number == 1) {
            dividers = 1;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    dividers += 1;
                }
            }
        }
        return dividers;
    }
}
