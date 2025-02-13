package main.java.com.bhaggie.coreBasics.coreOperations;

public class LeetCodeProblems {
    public static int[] returnIndicesOfTwoNumbersAddingUpToTarget(int[] inputArray, int target) {
        int[] resultantArray = new int[0];
        for (int i = 0; i<inputArray.length; i++) {
            for (int j=i+1; j<inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    resultantArray = new int[]{i, j};
                }
            }
        } return resultantArray;
    }

    public int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int r;
            r = num % 10;
            sum = sum + r;
            num = num / 10;

            if (sum > 9 && num <= 0) {
                num = sum;
                sum = 0;
            }
        } return sum;
    }


    public static int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String sentence : sentences) {
            int count = 1;
            for(int i = 0; i<sentence.length(); i++) {
                if(sentence.charAt(i) == ' ') {
                    count++;
                }
            } if (count>maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }


    public static int countDigits(int num) {
        int count = 0;
        int numDivCheck = num;
        while(numDivCheck > 0) {
            int r = numDivCheck % 10;
            if(num % r == 0) {
                count++;
            }
            numDivCheck = numDivCheck/10;
        } return count;
    }



}
