package main.java.com.bhaggie.coreBasics.coreUtils;

import main.java.com.bhaggie.coreBasics.coreOperations.Palindrome;
import main.java.com.bhaggie.coreBasics.coreOperations.Searching;
import main.java.com.bhaggie.coreBasics.coreOperations.Sorting;
import main.java.com.bhaggie.coreBasics.coreOperations.SwapTwoNumbers;

import java.util.Scanner;

public class SelectConceptOrOperation {
    static Scanner sc = new Scanner(System.in);
    public static void SelectRequiredConceptOrOperation() {
        System.out.println("Make the required selection: ");
        System.out.println("1 - to learn a concept");
        System.out.println("2 - to execute an operation");

        int selectRequiredConceptOrOperation = sc.nextInt();

        switch(selectRequiredConceptOrOperation) {
            case 1:
                selectRequiredConcept();
                break;
            case 2:
                selectRequiredOperation();
                break;
        }
    }
    public static void selectRequiredConcept() {
        System.out.println("Enter the concept to learn: ");
        int selectConcept = sc.nextInt();
        System.out.println("Enter the sub-concept to learn: ");
        int selectSubConcept = sc.nextInt();

        switch(selectConcept) {
            case 1:
                switch(selectSubConcept) {
                    case 1:

                        break;
                    case 2:

                        break;
                }
        }

    }
    public static void selectRequiredOperation() {
        System.out.println("Enter the opertion to execute: ");
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
