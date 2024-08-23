package week1.day5;

public class SumOddNumbersInRange {
    public static void main(String[] args) {
        int numInf = 1;
        int numSup = 10;
        System.out.println(sumOddInRange(numInf, numSup));
    }

    public static int sumOddInRange(int numInf, int numSup) {
        int sum = 0;
        if (numInf <= numSup) {
            while (numInf <= numSup) {
                if (numInf % 2 != 0) {
                    sum += numInf;
                }
                numInf++;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
