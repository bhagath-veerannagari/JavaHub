package main.java.com.bhaggie.coreBasics;

import java.util.Scanner;

public class SelectOperation {
    public static void selectRequiredOperation() {
        System.out.println("Enter the opertion to execute: ");
        Scanner sc = new Scanner(System.in);
        int selectOperation = sc.nextInt();
        System.out.println("Enter the inner opertion to execute: ");
        int selectInnerOperation = sc.nextInt();

        switch(selectOperation) {
            case 1: // SwapTwoNumbers
                switch(selectInnerOperation) {
                    case 1:
                        SwapTwoNumbers.swapWithThirdvariable();
                        break;
                    case 2:
                        SwapTwoNumbers.swapWithOutThirdVariable();
                        break;
                }
                break;

            case 2: // Palindrome Operations
                switch(selectInnerOperation) {
                    case 1:
                        Palindrome.numberPalindrome();
                        break;
                    case 2:
                        Palindrome.stringPalindrome();
                        break;
                }
                break;

            case 3: // Sorting
                switch(selectInnerOperation) {
                    case 1:
                        Sorting.selectionSortAscending();
                        break;
                    case 2:
                        Sorting.selectionSortDescending();
                        break;
                }
                break;

            case 4: // Searching
                switch(selectInnerOperation) {
                    case 1:
                        Searching.linearSearch();
                        break;
                    case 2:
                        break;
                }
                break;
        }
    }
}
