package main.java.com.bhaggie.coreBasics.coreUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoreUtilsFactory {
    public static int[] inputElementsIntoArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arrayElements[] = new int[n];
        System.out.println("Enter the elements into array:");
        for(int i = 0; i<n; i++) {
            arrayElements[i] = sc.nextInt();
        }
        return arrayElements;
    }

    public static void charCount(String str) {
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

    public static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
