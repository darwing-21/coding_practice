package week1.day4;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3}, {4, 5}, {6, 7}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = productMatrix(matrix1, matrix2);
        printMatrix(result);
    }

    public static int[][] productMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] output = new int[matrix1.length][matrix2[0].length];
        if (isColumnFilaEquals(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    output[i][j] = multiplyArrayWithMatrixColumn(matrix1[i], matrix2, j);
                }
            }
        }
        return output;
    }

    public static int multiplyArrayWithMatrixColumn(int[] arr, int[][] matrix, int pos) {
        int result = 0;
        for (int i=0; i<arr.length;i++){
            result += arr[i] * matrix[i][pos];
        }
        return result;
    }

    public static boolean isColumnFilaEquals(int[][] matrix1, int[][] matrix2) {
        return matrix1[0].length == matrix2.length;
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
