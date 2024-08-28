package week2.day2;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String text = "programming";
        System.out.println(removeDuplicateCharacter(text));
    }

    public static String removeDuplicateCharacter(String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            if (!isExists(output, text.charAt(i))) {
                output += text.charAt(i);
            }
        }
        return output;
    }

    public static boolean isExists(String text, char character) {
        boolean isExist = false;
        int i = 0;
        while (!isExist && i < text.length()) {
            if (text.charAt(i) == character) {
                isExist = true;
            }
            i++;
        }
        return isExist;
    }
}
