package main.java.com.bhaggie.learning.Basic.concept.OOPS.encapsulation;

import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;

public class EncapsulationMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bhagath", TEN, false);

        System.out.println(account.withDraw(new BigDecimal(4.0)));

        System.out.println(account.getBalance());
    }
}
