package week1.day1;

public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        String reversedBetter = reverseStringBetter(input);
        System.out.println(reversed);
        System.out.println(reversedBetter);
    }

    //Solution initial
    public static String reverseString(String text) {
        String outputTex = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            outputTex += text.charAt(i);
        }
        return outputTex;
    }

    //Solution better
    public static String reverseStringBetter(String text) {
        StringBuilder outputText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            outputText.append(text.charAt(i));
        }
        return outputText.toString();
    }
}

