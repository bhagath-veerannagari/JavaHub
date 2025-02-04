package main.java.com.bhaggie.coreBasics.coreOperations;

import main.java.com.bhaggie.coreBasics.utils.CoreUtils;

import main.java.com.bhaggie.coreBasics.utils.CoreUtils;

import java.util.Arrays;

public class Sorting {
    public static int[] selectionSortAscending() {
        int inputArray[] = CoreUtils.inputElementsIntoArray();
        for(int i = 0; i<inputArray.length; i++) {
            for(int j = i+1; j<inputArray.length; j++) {
                if(inputArray[i] > inputArray[j]) {
                    inputArray[i] = inputArray[i] + inputArray[j];
                    inputArray[j] = inputArray[i] - inputArray[j];
                    inputArray[i] = inputArray[i] - inputArray[j];
                }
            }
        }
        System.out.println("The sorted array in ascending order is :" + Arrays.toString(inputArray));
        return inputArray;
    }

    public static int[] selectionSortDescending() {
        int[] inputArray = CoreUtils.inputElementsIntoArray();
        for(int i = 0; i<inputArray.length; i++) {
            for(int j = i+1; j<inputArray.length; j++) {
                if(inputArray[i] < inputArray[j]) {
                    inputArray[i] = inputArray[i] + inputArray[j];
                    inputArray[j] = inputArray[i] - inputArray[j];
                    inputArray[i] = inputArray[i] - inputArray[j];
                }
            }
        }
        return inputArray;
    }

    public void bubbleSort() {

    }

    public void heapSort() {

    }
}
