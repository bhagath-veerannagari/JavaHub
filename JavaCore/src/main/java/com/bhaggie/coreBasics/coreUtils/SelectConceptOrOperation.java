package main.java.com.bhaggie.coreBasics.coreUtils;

import main.java.com.bhaggie.coreBasics.coreConcepts.DataStructures;
import main.java.com.bhaggie.coreBasics.coreConcepts.OOPS;
import main.java.com.bhaggie.coreBasics.coreConcepts.Streams;
import main.java.com.bhaggie.coreBasics.coreConcepts.TheBasics;
import main.java.com.bhaggie.coreBasics.coreOperations.*;

import java.util.Arrays;
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
            case 1: // The Basics
                switch(selectSubConcept) {
                    case 1:
                        TheBasics.printfunction();
                        break;
                    case 2:
                        TheBasics.learnComments();
                        break;
                    case 3:
                        TheBasics.learnVariables();
                        break;
                    case 4:
                        TheBasics.learnOperators();
                        break;
                }
                break;

            case 2: // DataStructures
                switch(selectSubConcept) {
                    case 1:
                        DataStructures.learnArrays();
                        break;
                    case 2:
                        DataStructures.learnLists();
                        break;
                    case 3:
                        DataStructures.learnQueue();
                        break;
                    case 4:
                        DataStructures.learnStack();
                        break;
                }
                break;

            case 3: // OOPS
                switch(selectSubConcept) {
                    case 1:
                        OOPS.learnClassesAndObjects();
                        break;
                    case 2:
                        OOPS.understandingClassesAndObjects();
                        break;
                    case 3:
                        OOPS.learnInheritance();
                        break;
                    case 4:
                        OOPS.learnEncapsulation();
                        break;
                }
                break;

            case 4: // Streams
                switch(selectSubConcept) {
                    case 1:
                        Streams.getCharCount();
                        break;
                    case 2:
                        break;
                }
                break;
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

            case 5: // ArrayOperations
                switch (selectInnerOperation) {
                    case 1:
                        int[] inputArray = CoreUtilsFactory.inputElementsIntoArray();
                        System.out.println("Enter the target value: ");
                        int target = sc.nextInt();
                        System.out.println(Arrays.toString(ArrayOperations.returnIndicesOfTwoNumbersAddingUpToTarget(inputArray, target)));
                }
        }
    }
}

