package main.java.com.bhaggie.coreBasics;

import java.util.Scanner;

public class CoreUtils {
    public static int[] inputElementsIntoArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arrayElements[] = new int[n];
        System.out.println("Enter the elements into array:");
        for(int i = 0; i<n; i++) {
            arrayElements[i] = sc.nextInt();
        }
        return arrayElements;
    }
}
