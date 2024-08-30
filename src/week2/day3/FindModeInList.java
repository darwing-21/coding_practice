package week2.day3;

import java.util.ArrayList;

public class FindModeInList {
    public static void main(String[] args) {
        int[] list = {1, 2, 2, 3, 4, 4, 4, 5, 2, 7, 5, 2};
        System.out.println(findMode(list));
    }

    public static int findMode(int[] list) {
        ArrayList<ArrayList<Integer>> listKeyValue = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (isExist(listKeyValue, list[i])) {
                int position = getPosition(listKeyValue, list[i]);
                ArrayList<Integer> element = listKeyValue.get(position);
                int currentValue = element.get(1);
                element.set(1, currentValue + 1);

            } else {
                ArrayList<Integer> element = new ArrayList<>();
                element.add(list[i]);
                element.add(1);
                listKeyValue.add(element);
            }
        }
        return getValueMode(listKeyValue);
    }

    public static boolean isExist(ArrayList<ArrayList<Integer>> list, int n) {
        boolean isExist = false;
        int i = 0;
        while (i < list.size() && !isExist) {
            ArrayList<Integer> element = list.get(i);
            if (element.get(0) == n) {
                isExist = true;
            }
            i++;
        }
        return isExist;
    }

    public static int getPosition(ArrayList<ArrayList<Integer>> list, int n) {
        boolean isExist = false;
        int position = -1;
        int i = 0;
        while (i < list.size() && !isExist) {
            ArrayList<Integer> element = list.get(i);
            if (element.get(0) == n) {
                isExist = true;
                position = i;
            }
            i++;
        }
        return position;
    }

    public static int getValueMode(ArrayList<ArrayList<Integer>> list) {
        int valueMode = 0;
        int keyMode = 0;
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> element = list.get(i);
            if (valueMode < element.get(1)) {
                valueMode = element.get(1);
                keyMode = element.get(0);
            }
        }
        return keyMode;
    }
}
