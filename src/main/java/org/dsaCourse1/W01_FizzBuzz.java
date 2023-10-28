package org.dsaCourse1;

public class W01_FizzBuzz {
    public static void fizzBuzzSolution(int n) {
        for (int i = 1; i<= n; i++) {
            boolean isMultipleOfThree = i % 3 == 0;
            boolean isMultipleOfFive = i % 5 == 0;
            boolean isMultipleOfBoth = isMultipleOfFive && isMultipleOfThree;


            if (isMultipleOfBoth) {
                System.out.println("FizzBuzz");
            } else if (isMultipleOfFive) {
                System.out.println("Buzz");
            } else if (isMultipleOfThree) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}