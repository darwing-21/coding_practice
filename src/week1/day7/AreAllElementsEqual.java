package week1.day7;

public class AreAllElementsEqual {
    public static void main(String[] args) {
        int[] list = {7, 7, 7, 7};
        System.out.println(isEqualsAllElements(list));
    }

    public static boolean isEqualsAllElements(int[] list) {
        boolean isEqual = true;
        int i = 0;
        int firstElement = list[0];
        while (isEqual && i < list.length) {
            if (firstElement != list[i]) {
                isEqual = false;
            }
            i++;
        }
        return isEqual;
    }
}
