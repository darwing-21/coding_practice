package week1.day4;

public class FindMaximumInList {
    public static void main(String[] args){
        int[] list = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println(findMaximum(list));
    }

    public static int findMaximum(int[] list){
        int max = -1;
        for (int i: list){
            if (max<i){
                max = i;
            }
        }
        return max;
    }
}
