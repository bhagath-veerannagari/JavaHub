package main.java.com.bhaggie.learning.Basic.concept.DataStructures;

import java.util.Stack;

public class TheStack {
    public static void main(String[] args) {
        Stack allTypes = new Stack();
        allTypes.push("Hello");
        allTypes.push("Bhaggie");
        allTypes.push(10);
        allTypes.push(false);
        allTypes.push(15.5);

        System.out.println(allTypes);

        allTypes.pop();

        System.out.println(allTypes);
        System.out.println(allTypes.peek());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
    }
}
