package week1.day3;

import java.util.ArrayList;

public class CharacterCounter {

    public static void main(String[] args) {
        String text = "apple";
        System.out.println(counterCharacter(text));
    }

    public static ArrayList<String> counterCharacter(String text) {
        ArrayList<String> output = new ArrayList<>();
        while (!text.isEmpty()){
            String element = text.charAt(0) + " : " + counterCharacterText(text, text.charAt(0));
            output.add(element);
            text = removeCharacter(text,text.charAt(0));
        }
        return output;
    }

    public static int counterCharacterText(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static String removeCharacter(String text, char character) {
        return text.replace(Character.toString(character), "");
    }
}

