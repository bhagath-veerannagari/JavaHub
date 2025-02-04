package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.Scanner;

public class Palindrome {
    public static void numberPalindrome() {
        System.out.println("Enter a number to check if its a palindrome:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isPalindrome = isPalindromeNumber(n);
        if(isPalindrome) {
            System.out.println("The entered number is a Palindrome");
        } else System.out.println("The entered number is not a palindrome");
    }

    public static void stringPalindrome() {
        System.out.println("Enter a string to check if its a palindrome:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean isPalindrome = isPalindromeString(s);
        if(isPalindrome) {
            System.out.println("The entered string is a Palindrome");
        } else System.out.println("The entered string is not a palindrome");
    }

    public static Boolean isPalindromeNumber(int n) {
        int r, sum = 0, N = n;
        while(n>0) {
            r = n%10;
            sum = sum*10 + r;
            n = n/10;
        }
        if(sum == N) {
            return true;
        } else return false;
    }

    public static Boolean isPalindromeString(String s) {
        String rev = "";
        for(int i = s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev.equals(s);
    }
}
