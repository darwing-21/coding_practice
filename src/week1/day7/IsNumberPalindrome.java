package week1.day7;

public class IsNumberPalindrome {
    public static void main(String[] args) {
        int number = 121121;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int n) {
        boolean isPalindrome = true;
        String number = "" + n;
        int i = 0;
        int j = number.length() - 1;
        while (isPalindrome && i < j) {
            if (number.charAt(i) != number.charAt(j)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
