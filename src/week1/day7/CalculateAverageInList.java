package week1.day7;

public class CalculateAverageInList {

    public static void main(String[] args) {
        int[] list = {2, 4, 6, 8, 10, 12};
        System.out.println(calculateAverage(list));
    }

    public static double calculateAverage(int[] list) {
        int sum = 0;
        for (int j : list) {
            sum += j;
        }
        return (double) sum / list.length;
    }
}
