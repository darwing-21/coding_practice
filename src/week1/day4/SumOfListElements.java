package week1.day4;

public class SumOfListElements {
    public static void main(String[] args) {
        int[] list = {-1, 2, 3, 4, 5};
        System.out.println(sumOfElementsList(list));
    }

    public static int sumOfElementsList(int[] list) {
        int sum = 0;
        for (int j : list) {
            sum += j;
        }
        return sum;
    }
}
