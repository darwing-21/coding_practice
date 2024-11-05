package week2.day5;

public class CheckDigitsOnly {
    public static void main(String[] args) {
        String text = "123456";
        System.out.println(isDigitOnly(text));
    }

    public static boolean isDigitOnly(String text) {
        boolean isTrue = true;
        try {
            Integer.parseInt(text);
        }catch (NumberFormatException e){
            isTrue = false;
        }
        return  isTrue;
    }
}
