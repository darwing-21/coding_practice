package week1.day3;

import java.util.ArrayList;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {{5, 5}, {5, 5}};
        int[][] matrix2 = {{3, 4}, {5, 5}};
        int[][] result = sumMatrix(matrix1, matrix2);
        printMatrix(result);
    }

    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] output = new int[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                if (isEqualsLength(matrix1[i], matrix2[i])) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        output[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
            }
        }
        return output;
    }

    public static boolean isEqualsLength(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
