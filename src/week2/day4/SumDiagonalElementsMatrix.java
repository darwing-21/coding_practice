package week2.day4;

public class SumDiagonalElementsMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 5}, {3, 4, 10}, {10, 20, 30}};
        System.out.println(sumDiagonalElements(matrix));
    }

    public static int sumDiagonalElements(int[][] matrix) {
        int sum = 0;
        if (isEqualRowColum(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }

    public static boolean isEqualRowColum(int[][] matrix) {
        boolean isEqual = true;
        int i = 0;
        while (isEqual && i < matrix.length) {
            if (matrix.length != matrix[i].length) {
                isEqual = false;
            }
            i++;
        }
        return isEqual;
    }
}
