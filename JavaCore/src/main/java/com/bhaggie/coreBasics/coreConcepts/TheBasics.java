package main.java.com.bhaggie.coreBasics.coreConcepts;

public class TheBasics {

    public static void printfunction() {
        // Print in same line
        System.out.print("Hello world!");
        System.out.print("Welcome to Bhaggie's world of Java Programming !!");

        // Print in different lines
        System.out.println("Start Learning");
        System.out.println("and Let's Rock !!");
    }

    public static void learnComments() {
        // Single line Comment

        /*
            Multi
            Line
            Comments
        */

        System.out.println("This is about comments !!");
    }

    public static void learnVariables() {
        // 1. Variables
        // Primitives - allows to store simple values
        int num1 = 20;
        int num2 = 20;
        System.out.println(num1 + num2);
        int result = num1 + num2;
        System.out.println(result);

        double pi = 3.14;
        boolean isAdult = false;
        char ch = 'A';

        System.out.println("---------------------------------------------------------------------------------------------------");

        // 2. Numeric Literals with Underscore - using underscores makes the readability easy
        num1 = 1000000008;
        num2 = 1_000_000_008;
        System.out.println(num1);
        System.out.println(num2);

        double num3 = 1_000_000_008.45;
        double num4 = 1_008.45;
        System.out.println(num3);
        System.out.println(num4);
    }

    public static void learnOperators() {
        // 1. Arithmetic Operators
        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        System.out.println("---------------------------------------------------------------------------------------------------");

        // 2. Increment and Decrement operators
        num1 = 1;
        int inc = num1 + 1;
        int dec = num1 - 1;
        System.out.println(inc);
        System.out.println(dec);

        System.out.println(num1++);  // prints 1, saves as 2
        System.out.println(++num1);  // prints 3, saves as 3
        System.out.println(num1--);  // prints 3, saves as 2
        System.out.println(--num1);  //prints 1, saves as 1

        System.out.println(++num1 + --num1 + num1-- - --num1 + num1++ - num1--); // (2 + 1 + 1 - -1 + -1 - 0 = 4), prints 4

        System.out.println("---------------------------------------------------------------------------------------------------");

        // 3. Comparison operators - " < <= > >= != "
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 != 10);

        boolean isGreater = 15 >= 16;
        System.out.println(isGreater);

        System.out.println("---------------------------------------------------------------------------------------------------");

        // 5. ShortHand re-assignment

    }
}