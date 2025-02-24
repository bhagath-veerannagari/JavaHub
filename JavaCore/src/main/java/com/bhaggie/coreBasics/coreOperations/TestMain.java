package main.java.com.bhaggie.coreBasics.coreOperations;

import java.util.HashSet;

public class TestMain {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }
    public static  String firstPalindrome(String[] words) {
        String resultantString = "";
        for (String word : words) {
            String rev = "";
            for (int i = word.length()-1; i>=0; i--) {
                rev = rev + word.charAt(i);
            }
            if(rev.equals(word)) {
                resultantString = word;
                break;
            }
        } return resultantString;
    }
}
