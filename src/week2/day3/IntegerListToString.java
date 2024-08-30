package week2.day3;

public class IntegerListToString {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println(converString(number));
    }

    public static String convertertoString(int n) {
        return "" + n;
    }

    public static String converString(int n) {
        String output = "";
        while (n > 0) {
            output += n % 10;
            n = n / 10;
        }
        return reverseString(output);
    }

    public static String reverseString(String number) {
        String output = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            output += number.charAt(i);
        }
        return output;
    }
}
