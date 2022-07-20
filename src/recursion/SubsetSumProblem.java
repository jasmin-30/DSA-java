package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array of n elements and a number sum.
we need to find how many subset's sum becomes equal to sum.

I/P: array: [10, 5, 2, 3, 6], sum = 8
O/P: 2

I/P: array: [1, 2, 3], sum = 4
O/P: 1

I/P: array: [10, 20, 15], sum = 37
O/P: 0

I/P: array: [10, 20, 15], sum = 0
O/P: 1
 */
public class SubsetSumProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = Integer.parseInt(str_a[i]);
        }
        int sum = Integer.parseInt(reader.readLine());

        System.out.println(countSubsets(array, n, sum));
    }

    private static int countSubsets(int[] array, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;

        return countSubsets(array, n-1, sum) + countSubsets(array, n-1, sum - array[n-1]);
    }
}
