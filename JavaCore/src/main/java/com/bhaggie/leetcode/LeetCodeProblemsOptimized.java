package main.java.com.bhaggie.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCodeProblemsOptimized {

    /*
    *
    * The digital root of a number is the value obtained by repeatedly
    * summing its digits until a single digit is reached.
    * Mathematically: For +ve numbers : Digital Root=1+(num−1)%9
    *
    */
    public int addDigits(int num) {
        return 1+(num-1)%9; // Digital Root Concept
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> freqCount = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            freqCount.put(s.charAt(i), freqCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (freqCount.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }


    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; i+=2) {
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
        }
        return arr;
    }


    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0; i<sentence.length(); i++) {
            hashSet.add(sentence.charAt(i));
        } return hashSet.size()==26;
    }


    // {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
    public static int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (int i = 0; i< sentences.length; i++) {
            String[] arr = sentences[i].split(" ");
            if (arr.length>maxCount) {
                maxCount = arr.length;
            }
        }
        return maxCount;
    }


    // {"abc","car","ada","racecar","cool"}
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            String reversed = new StringBuilder(s).reverse().toString();

            if (s.equals(reversed)) {
                return s;
            }
        }
        return "";
    }
}
