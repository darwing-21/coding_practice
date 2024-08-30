package week2;

public class PalindromeListChecker {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 1};
        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(int[] list) {
        boolean isPalindrome = true;
        int i = 0;
        int j = list.length-1;
        while (i < j && isPalindrome) {
            if (list[i] != list[j]) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
