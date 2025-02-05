package main.java.com.bhaggie.coreBasics.coreOperations;

import main.java.com.bhaggie.coreBasics.coreUtils.CoreUtilsFactory;

public class RemoveDuplicates {
    public static void removeDuplicates() {
        CoreUtilsFactory.removeDuplicate("geeksforgeeks".toCharArray(), "geeksforgeeks".toCharArray().length);
    }
}
