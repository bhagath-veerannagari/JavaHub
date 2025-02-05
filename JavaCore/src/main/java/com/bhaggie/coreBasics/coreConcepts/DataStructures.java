package main.java.com.bhaggie.coreBasics.coreConcepts;

import java.util.*;

public class DataStructures {

    static record Person(String name, int age) {
    }

    public static void learnArrays() {
        int[] numbers = new int[7];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        String[] colors = new String[7];
        colors[0] = "Violet";
        colors[1] = "Indigo";
        System.out.println(Arrays.toString(colors));

        // Different ways to loop through arrays !!
        // 1. Using for loop
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // 2. Using enhanced for loop
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Using streams
        Arrays.stream(colors).forEach(System.out::println);

        // Working with 2D Arrays !!
        char[][] board0 = new char[3][3];
        for (int i = 0; i<3 ; i++) {
            for (int j = 0; j<3 ; j++) {
                board0[i][j] = '-';
            }
        }

        char[][] board1 = new char[][] {
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'}
        };

        System.out.println(Arrays.deepToString(board0));
        System.out.println(Arrays.deepToString(board1));

        char[][] board2 = new char[3][3];
        for (int i = 0; i<3 ; i++) {
            for (int j = 0; j<3 ; j++) {
                if (j == 0) {
                    board2[i][j] = '0';
                } else {
                    board2[i][j] = '-';
                }
            }
        }

        char[][] board3 = new char[][] {
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'}
        };

        System.out.println(Arrays.deepToString(board2));
        System.out.println(Arrays.deepToString(board3));
    }

    public static void learnLists() {
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

    public static void learnQueue() {
        Queue allTypes = new LinkedList();
        allTypes.add(1);
        allTypes.add("India");
        allTypes.add("Australia");
        allTypes.add(false);

        System.out.println(allTypes);
        allTypes.poll();
        System.out.println(allTypes.peek());

        System.out.println(allTypes);

        Queue<DataStructures.Person> personQueue = new LinkedList<>();
        personQueue.add(new DataStructures.Person("Bhaggie", 29));
        personQueue.add(new DataStructures.Person("Roshan", 39));
        personQueue.add(new DataStructures.Person("Sunder", 19));

        System.out.println(personQueue);

        System.out.println(personQueue.poll());
    }

    public static void learnStack() {
        Stack allTypes = new Stack();
        allTypes.push("Hello");
        allTypes.push("Bhaggie");
        allTypes.push(10);
        allTypes.push(false);
        allTypes.push(15.5);

        System.out.println(allTypes);

        allTypes.pop();

        System.out.println(allTypes);
        System.out.println(allTypes.peek());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
    }
}
