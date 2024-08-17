package week1.day2;

public class PalindromeChecker {
    public static void main(String[] args) {
        String text = "oso";
        System.out.println(isPalindrome(text));

    }

    public static boolean isPalindrome(String text) {
        boolean output = true;
        int j = text.length() - 1;
        int i = 0;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                output = false;
                break;
            }
            i++;
            j--;
        }
        return output;
    }
}
