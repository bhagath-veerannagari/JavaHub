package main.java.com.bhaggie.coreBasics.coreConcepts;

public class TheStrings {
    public static char usingCharAt(String str, int index) {
        return str.charAt(index);
    }
    public static char usingToCharArray(String str, int index) {
        return str.toCharArray()[index];
    }
    public static char usingStreams(String str, int index) {
        return str.chars()
                .mapToObj(ch -> (char)ch)
                .toArray(Character[] ::new)[index];
    }

    public static void main(String[] args) {
        System.out.println(usingCharAt("BhagGie", 4));
        System.out.println(usingToCharArray("BhagGie", 3));
        System.out.println(usingStreams("Bhaggie", 0));
    }
}

