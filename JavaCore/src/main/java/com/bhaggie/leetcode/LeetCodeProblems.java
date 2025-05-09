package main.java.com.bhaggie.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class LeetCodeProblems {
    public static int[] returnIndicesOfTwoNumbersAddingUpToTarget(int[] inputArray, int target) {
        int[] resultantArray = new int[0];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    resultantArray = new int[]{i, j};
                }
            }
        }
        return resultantArray;
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
        }
        return sum;
    }


    public static int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String sentence : sentences) {
            int count = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }


    public static int countDigits(int num) {
        int count = 0;
        int numDivCheck = num;
        while (numDivCheck > 0) {
            int r = numDivCheck % 10;
            if (num % r == 0) {
                count++;
            }
            numDivCheck = numDivCheck / 10;
        }
        return count;
    }


    public static String firstPalindrome(String[] words) {
        String resultantString = "";
        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            if (rev.equals(word)) {
                resultantString = word;
                break;
            }
        }
        return resultantString;
    }


    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }


    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int num : nums) {
            elementSum = elementSum + num;
            while (num > 0) {
                digitSum = digitSum + num % 10;
                num = num / 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }


    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }


    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
            if ('A' <= ch[i] && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] - 'A' + 'a');
        return new String(ch);
    }


    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }


    public String triangleType(int[] nums) {
        if (nums[0] >= nums[1] + nums[2] || nums[1] >= nums[2] + nums[0] || nums[2] >= nums[0] + nums[1]) return "none";
        else if (nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        else if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2]) return "scalene";
        else return "isosceles";
    }


    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indexList.add(i);
            }
        }
        return indexList;
    }


    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }


    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum = sum + (n % 10);
            product = product * (n % 10);
            n = n / 10;
        }
        return product - sum;
    }


    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > highestWealth) {
                highestWealth = sum;
            }
        }
        return highestWealth;
    }


    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] % 2 != 0 && arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }


    public static int arraySign(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            else if (nums[i] < 0) {
                product = product * -1;
            }
        } return product ;
    }



    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        int sum = 0;
        for(String operation: operations) {
            if(operation.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if(operation.equals("C")) stack.pop();
            else if(operation.equals("D")) stack.push(2*stack.peek());
            else stack.push(Integer.valueOf(operation));
        }

        for (int score: stack) {
            sum = sum + score;
        } return sum;
    }



    public boolean canAliceWin(int[] nums) {
        int singleSum = 0, doubleSum = 0;
        for (int num:nums) {
            if(num < 10) {
                singleSum += num;
            } else doubleSum += num;
        } return singleSum != doubleSum;
    }


    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }


    public int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            xor ^= num;
        }
        return xor;
    }


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
