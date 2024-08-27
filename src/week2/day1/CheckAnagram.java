package week2.day1;

public class CheckAnagram {
    public static void main(String[] args) {
        String text1 = "listen";
        String text2 = "silent";
        System.out.println(isAnagram(text1, text2));
    }

    public static boolean isAnagram(String text1, String text2) {
        boolean isAnagram = true;
         if (text1.length() == text2.length()) {
            int i = 0;
            while (isAnagram && i < text1.length()) {
                if (!isExists(text2, text1.charAt(i))) {
                    isAnagram = false;
                }
                text2 = removeFirstCharacter(text2, text1.charAt(i));
                i++;
            }
        }
        return isAnagram;
    }

    public static boolean isExists(String text, char character) {
        boolean isExists = false;
        int i = 0;
        while (!isExists && i < text.length()) {
            if (text.charAt(i) == character) {
                isExists = true;
            }
            i++;
        }
        return isExists;
    }

    public static String removeFirstCharacter(String text, char character) {
        return text.replaceFirst(Character.toString(character), "");
    }
}
