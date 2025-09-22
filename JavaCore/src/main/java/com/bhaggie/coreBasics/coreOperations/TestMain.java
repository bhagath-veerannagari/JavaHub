package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.Arrays;
import java.util.Stack;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int sum = 0;
        while (x!=0) {
            sum = 10*sum + x%10;
            x /= 10;
        } return sum;
    }
}
