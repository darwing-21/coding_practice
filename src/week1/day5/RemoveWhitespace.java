package week1.day5;

public class RemoveWhitespace {

    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Hello world"));
    }

    public static String removeWhiteSpace(String text) {
        return text.replace(Character.toString(' '), "");
    }
}
