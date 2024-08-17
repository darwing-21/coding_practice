package week1.day1;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        int rangeInitial = 1;
        int rangeFinal = 15;
        ArrayList<String> fizzBuzz = fizzBuzz(rangeInitial,rangeFinal);
        print(fizzBuzz);
    }

    public static ArrayList<String> fizzBuzz(int i, int j) {
        ArrayList<String> output = new ArrayList<>();
        while (i <= j) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add("" + i);
            }
            i++;
        }
        return output;
    }

    public static void print(ArrayList<String> fizzBuzz){
        for (int i =0 ; i<fizzBuzz.size();i++){
            System.out.println(fizzBuzz.get(i));
        }
    }
}
