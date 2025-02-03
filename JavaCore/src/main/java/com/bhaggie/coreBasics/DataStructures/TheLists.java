package main.java.com.bhaggie.coreBasics.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TheLists {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add(1);
        colors.add(false);
        colors.add(new Object());

        //System.out.println(colors.size());

        colors.add("Blue");
        colors.add("Green");

        //System.out.println(colors.size());

        List<String> colors2 = new ArrayList<>();
        colors2.add("Violet");
        colors2.add("Indigo");

        System.out.println(colors2.size());

        colors2.remove("Indigo");
        colors2.add("Blue");
        colors2.add("Green");

        System.out.println(colors2.size());
        System.out.println(colors2);

        ArrayList<String> colors3 = new ArrayList<>();
        colors3.add("Violet");
        colors3.add("Indigo");

        //System.out.println(colors3.size());

        colors3.add("Blue");
        colors3.add("Green");

        //System.out.println(colors3.size());

        Stack colors4 = new Stack();
        colors4.push("Violet");
        colors4.push("Indigo");
        colors4.push("Blue");
        colors4.push("Green");
        //System.out.println(colors4);
        //System.out.println(colors4.peek());
        colors4.pop();
        //System.out.println(colors4.size());
        //System.out.println(colors4.peek());

        for (Object color : colors) {
            System.out.println(color);
        }

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        colors.forEach(System.out::println);


    }
}
