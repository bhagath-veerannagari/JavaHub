package main.java.com.bhaggie.coreBasics.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        Queue allTypes = new LinkedList();
        allTypes.add(1);
        allTypes.add("India");
        allTypes.add("Australia");
        allTypes.add(false);

        System.out.println(allTypes);
        allTypes.poll();
        System.out.println(allTypes.peek());

        System.out.println(allTypes);

        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(new Person("Bhaggie", 29));
        personQueue.add(new Person("Roshan", 39));
        personQueue.add(new Person("Sunder", 19));

        System.out.println(personQueue);

        System.out.println(personQueue.poll());


    }
    static record Person(String name, int age) {
    }
}
