package week2.day1;

public class CountVowelsInString {
    public static void main(String[] args) {
        String text = "hello world";
        System.out.println(countVowels(text));
    }

    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                count++;
            }
        }
        return count;
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
