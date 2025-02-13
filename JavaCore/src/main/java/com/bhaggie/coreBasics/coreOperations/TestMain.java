package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.HashSet;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
    public static int countDigits(int num) {
        int count = 0;
        int numDivCheck = num;
        while(numDivCheck > 0) {
            int r = numDivCheck % 10;
            if(num % r == 0) {
                count++;
            }
            numDivCheck = numDivCheck/10;
        } return count;
    }
}
