package main.java.com.bhaggie.coreBasics.coreConcepts.DataStructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
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
}
