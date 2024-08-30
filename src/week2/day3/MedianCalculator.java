package week2.day3;

public class MedianCalculator {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 2};
        int[] list2 ={1, 3, 4, 2, 5};
        System.out.println(findMedia(list));
        System.out.println(findMedia(list2));
    }

    public static double findMedia(int[] list) {
        int[] listSorted = sortList(list);
        double media;
        if (listSorted.length % 2 != 0) {
            media = listSorted[listSorted.length / 2];
        } else {
            int positionMedia = listSorted.length / 2 - 1;
            media = (double) (listSorted[positionMedia] + listSorted[positionMedia + 1]) / 2;
        }
        return media;
    }

    public static int[] sortList(int[] list) {
        if (list.length > 0) {
            boolean isChanges;
            do {
                isChanges = false;
                for (int i = 0; i < list.length - 1; i++) {
                    if (list[i] > list[i + 1]) {
                        int aux = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = aux;
                        isChanges = true;
                    }
                }
            } while (isChanges);
        }
        return list;
    }
}
