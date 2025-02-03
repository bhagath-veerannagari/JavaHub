package main.java.com.bhaggie.coreBasics;

import java.util.Scanner;

public class Searching {

    Scanner sc = new Scanner(System.in);

    public static void linearSearch() {
        int inputArray[] = CoreUtils.inputElementsIntoArray();
        System.out.println("Enter the element to search: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<inputArray.length; i++) {
            if(inputArray[i] == n) {
                System.out.println("The search is successful and the number is found at: " + i + "th index");
            }
        }
    }
    public void binarySearch() {
        //inputArray = Sorting.selectionSortAscending();
        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();

    }
}
