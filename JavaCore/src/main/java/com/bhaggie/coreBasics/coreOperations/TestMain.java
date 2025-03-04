package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(isValid("({}())"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')'); //
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
