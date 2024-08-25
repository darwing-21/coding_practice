package week1.day6;

public class ReplaceVowelsInString {
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println(replaceVowelsInString(text));
    }

    public static String replaceVowelsInString(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                newText += "*";
            } else {
                newText += text.charAt(i);
            }
        }
        return newText;
    }

    public static boolean isVowel(char character) {
        boolean isVowel = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int i = 0;
        while (!isVowel && i < vowels.length) {
            if (vowels[i] == character) {
                isVowel = true;
            }
            i++;
        }
        return isVowel;
    }
}
