package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array, we need to find maximum sum of a subarray.

Example:

I/P: [2, 3, -8, 7, -1, 2, 3]
O/P: 11
exp: sum of [7, -1, 2, 3] = 11 which is maximum sum of any subarray

I/P: [5, 8, 3]
O/P: 16
exp: sum of [5, 8, 3] = 16 which is maximum sum of any subarray

I/P: [-6, -1, -8]
O/P: -1
exp: sum of [-1] = -1 which is maximum sum of any subarray
 */
public class MaximumSubarraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        System.out.println(maxSubarraySum2(arr, n));
    }

    /*
    TC: O(n^2)
    SC: O(1)
     */
    private static int maxSubarraySum1(int[] arr, int n) {
        int res = Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            int currSum = 0;
            for (int j=i;j<n;j++) {
                currSum += arr[j];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }


    /*
    TC: O(n)
    SC: O(1)
     */
    private static int maxSubarraySum2(int[] arr, int n) {
        int res = arr[0];
        int prevMaxSum = arr[0];

        for (int i=1;i<n;i++) {
            prevMaxSum = Math.max(arr[i], prevMaxSum + arr[i]);
            res = Math.max(res, prevMaxSum);
        }
        return res;
    }
}
