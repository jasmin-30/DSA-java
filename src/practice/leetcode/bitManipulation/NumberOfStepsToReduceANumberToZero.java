package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
problem link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());

            int res = numberOfStepsEfficient(n);
            System.out.println(res);
        }
    }

    //Naive Approach
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1)!=1) {
                count++;
                num = num >> 1;
            } else {
                count++;
                num = num ^ 1;
            }
        }
        return count;
    }

    // Naive Approach recursive approach.
    public static int numberOfStepsRecursive(int num, int step) {
        if (num == 0)
            return step;

        if ((num & 1) == 0)
            return numberOfStepsRecursive(num>>1, ++step);
        else
            return numberOfStepsRecursive(num-1, ++step);
    }

    //Using brian kernighan algorithm
    public static int numberOfStepsEfficient(int num) {
        int ones = 0;
        int totalDigit = ((int)(Math.log(num)/Math.log(2)) + 1);
        int n = num;
        while (num != 0) {
            ones++;
            num = num & (num-1);
        }
        int zeroes = totalDigit - ones;

        return n==0 ? 0 : ones*2 + zeroes - 1;
    }
}
