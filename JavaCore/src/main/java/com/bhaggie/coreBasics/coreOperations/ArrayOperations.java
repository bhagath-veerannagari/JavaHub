package main.java.com.bhaggie.coreBasics.coreOperations;

public class ArrayOperations {

    public static int sumOfElementsInAnArray (int inputArray[]) {
        int sum = 0;
        for(int i=0; i<inputArray.length; i++) {
            sum = sum + inputArray[i];
        } return sum;
    }

    public static double avgOfElementsInAnArray (int inputArray[]) {
        return sumOfElementsInAnArray(inputArray)/inputArray.length;
    }
}
