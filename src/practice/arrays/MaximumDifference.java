package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array of n elements, you need to find maximum difference arr[j] - arr[i] such that j > i.
 */
public class MaximumDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        System.out.println(findMaxDiff2(arr, n));
    }


    /*
    TC: O(n^2)
    SC: O(1)
     */
    private static int findMaxDiff1(int[] arr, int n) {
        int res = arr[1] - arr[0];

        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }

    /*
    TC: O(n)
    SC: O(1)
     */
    private static int findMaxDiff2(int[] arr, int n) {
        int res = arr[1] - arr[0];
        int minVal = arr[0];

        for (int j=1;j<n;j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }

        return res;
    }
}
