package week1.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateList {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int cantRotate = 2;
        System.out.println(rotateList(list, cantRotate));
    }

    public static ArrayList<Integer> rotateList(int[] list, int cantRotate) {
        ArrayList<Integer> listRotate = new ArrayList<>();
        int i = 0;
        int j = list.length - 1;
        while (j >= 0) {
            if ((list.length - 1 - j) < cantRotate) {
                listRotate.add(list[j]);
            } else {
                listRotate.add(list[i]);
                i++;
            }
            j--;
        }
        return listRotate;
    }
}
