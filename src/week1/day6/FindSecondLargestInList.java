package week1.day6;

public class FindSecondLargestInList {
    public static void main(String[] args) {
        int[] list = {4, 2, 7, 1, 9, 3, 9};
        System.out.println(findSecondLargeNumberList(list));
    }

    public static int findSecondLargeNumberList(int[] list) {
        if (list.length > 0) {
            int max = list[0];
            int number = 0;
            for (int i = 1; i < list.length; i++) {
                if (max < list[i]) {
                    number = max;
                    max = list[i];
                } else {
                    if (number < list[i] && max > list[i]) {
                        number = list[i];
                    }
                }
            }
            return number;
        } else {
            return -1;
        }
    }


}
