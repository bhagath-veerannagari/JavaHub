package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swapWithThirdvariable() {
        System.out.println("Enter the value of 'a' :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of 'b' :");
        int b = sc.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("Here are the swapped values - value of a is: " + a + " and value of b is: " + b);
    }
    public static void swapWithOutThirdVariable() {
        System.out.println("Enter the value of 'a' :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of 'b' :");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Here are the swapped values - value of a is: " + a + " and value of b is: " + b);
    }
}
