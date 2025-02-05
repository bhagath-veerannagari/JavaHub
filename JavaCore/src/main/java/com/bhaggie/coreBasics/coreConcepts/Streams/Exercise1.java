package main.java.com.bhaggie.coreBasics.coreConcepts.Streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise1 {


    public void charCount(String str) {

        if (null == str || str.length() == 0) {
            return;
        }

        str.chars()
                .mapToObj(ch -> Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }


    public static void main(String[] args) {

        Exercise1 s = new Exercise1();
        s.charCount("1111345677788");
    }
}