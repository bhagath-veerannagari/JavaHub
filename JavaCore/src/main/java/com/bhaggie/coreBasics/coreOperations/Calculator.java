package main.java.com.bhaggie.coreBasics.coreOperations;

public class Calculator {
    public int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
