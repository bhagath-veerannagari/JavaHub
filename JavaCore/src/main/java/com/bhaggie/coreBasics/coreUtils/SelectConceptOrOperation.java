package main.java.com.bhaggie.coreBasics.coreUtils;

import main.java.com.bhaggie.coreBasics.coreConcepts.DataStructures;
import main.java.com.bhaggie.coreBasics.coreConcepts.OOPS;
import main.java.com.bhaggie.coreBasics.coreConcepts.Streams;
import main.java.com.bhaggie.coreBasics.coreConcepts.TheBasics;
import main.java.com.bhaggie.coreBasics.coreOperations.*;

import java.awt.desktop.SystemEventListener;
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
        System.out.println("1 - The basics");
        System.out.println("2 - Data Structures");
        System.out.println("3 - OOPS");
        System.out.println("4 - Streams");
        int selectConcept = sc.nextInt();
        int selectSubConcept;

        switch(selectConcept) {
            case 1: // The Basics
                System.out.println("Select the sub-concept");
                System.out.println("1 - Print Function");
                System.out.println("2 - Comments");
                System.out.println("3 - Variables");
                System.out.println("4 - Operators");
                selectSubConcept=sc.nextInt();
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
                System.out.println("Select the sub-concept");
                System.out.println("1 - Arrays");
                System.out.println("2 - Lists");
                System.out.println("3 - Queue");
                System.out.println("4 - Stack");
                selectSubConcept=sc.nextInt();
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
                System.out.println("Select the sub-concept");
                System.out.println("1 - Learn classes and objects");
                System.out.println("2 - Understanding classes and objects");
                System.out.println("3 - Learn Inheritance");
                System.out.println("4 - Learn Encapsulation");
                selectSubConcept=sc.nextInt();
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
                System.out.println("Select the sub-concept");
                System.out.println("1 - Character count");
                selectSubConcept=sc.nextInt();
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
        System.out.println("Enter the operation to execute: ");
        System.out.println("1 - Swapping two numbers");
        System.out.println("2 - Palindrome");
        System.out.println("3 - Soring");
        System.out.println("4 - Searching");
        System.out.println("5 - Array");
        int selectOperation = sc.nextInt();
        int selectInnerOperation;
        switch(selectOperation) {
            case 1: // SwapTwoNumbers
                System.out.println("Enter the inner operation to execute: ");
                System.out.println("1 - Swapping with the third variable");
                System.out.println("2 - Swapping without third variable");
                selectInnerOperation=sc.nextInt();
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
                System.out.println("Select the inner operation");
                System.out.println("1 - number to check if its a palindrome:");
                System.out.println("2 - to check if its a palindrome");
                selectInnerOperation=sc.nextInt();
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
                System.out.println("Select the inner operation");
                System.out.println("1 - Ascending sorting");
                System.out.println("2 - Descending sorting");
                selectInnerOperation=sc.nextInt();
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
                System.out.println("Select the inner operation");
                System.out.println("1 - Linear Search");
                selectInnerOperation=sc.nextInt();
                switch(selectInnerOperation) {
                    case 1:
                        Searching.linearSearch();
                        break;
                    case 2:
                        break;
                }
                break;

            case 5: // ArrayOperations
                System.out.println("Select the inner operation");
                System.out.println("1 - Sum of elements");
                selectInnerOperation=sc.nextInt();
                switch(selectInnerOperation) {
                    case 1:
                        int[] inputArray = CoreUtilsFactory.inputElementsIntoArray();
                        System.out.println("Enter the target value: ");
                        int target = sc.nextInt();
                        System.out.println(Arrays.toString(LeetCodeProblems.returnIndicesOfTwoNumbersAddingUpToTarget(inputArray, target)));
                        break;
                    case 2:
                        break;
                }
                break;
        }
    }
}

