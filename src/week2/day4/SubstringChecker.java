package week2.day4;

public class SubstringChecker {
    public static void main(String[] args) {
        String text = "hello world";
        String sub = "world";
        System.out.println(isSubString(text, sub));
    }

    public static boolean isSubString(String text, String sub) {
        boolean isSub = false;
        int i = 0;
        int j = 0;
        while (!isSub && i < text.length()) {
            if (text.charAt(i) == sub.charAt(j)) {
                if (j == sub.length() - 1) {
                    isSub = true;
                }
                j++;
            } else {
                j = 0;
            }
            i++;
        }


        return isSub;
    }


}
