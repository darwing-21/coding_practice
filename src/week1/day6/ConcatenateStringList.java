package week1.day6;

public class ConcatenateStringList {
    public static void main(String[] args) {
        String[] list = {"Hello", " ", "World", "!"};
        System.out.println(concatenateStringList(list));
    }

    public static String concatenateStringList(String[] list) {
        String text = "";
        for (int i = 0; i < list.length; i++) {
            text += list[i];
        }
        return text;
    }
}
