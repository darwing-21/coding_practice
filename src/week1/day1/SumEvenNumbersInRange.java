package week1.day1;

public class SumEvenNumbersInRange {
    public static void main(String[] args) {
        int rangeInitial = 2;
        int rangeFinal = 10;
        int sumEvenRange = sumEvenNumberInRange(rangeInitial,rangeFinal);
        System.out.println(sumEvenRange);
    }

    //Solution initial
    public static int sumEvenNumberInRange(int i, int j) {
        int output = 0;
        while (i <= j) {
            if (i % 2 == 0) {
                output += i;
            }
            i++;
        }
        return output;
    }
}
