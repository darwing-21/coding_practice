package week2.day4;

public class MultiplyListElements {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 5};
        System.out.println(multiplyElements(list));
    }

    public static int multiplyElements(int[] list) {
        int product = 1;
        if (list.length > 0) {
            for (int j : list) {
                product *= j;
            }
        } else {
            product = -1;
        }
        return product;
    }
}
