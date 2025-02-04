package main.java.com.bhaggie.coreBasics.concepts.testingExample;

public class Calculator {
    public int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
