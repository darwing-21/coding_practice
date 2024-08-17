package week1.day2;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        int factorialNumber = factorial(5);
        System.out.println(factorialNumber);
    }

    public static int factorial(int n) {
        int output = 1;
        if (isPositiveInteger(n)) {
            for (int i = 1; i <= n; i++) {
                output *= i;
            }
        } else {
            output = -1;
        }
        return output;
    }

    public static boolean isPositiveInteger(int n){
        return  n>0;
    }
}
