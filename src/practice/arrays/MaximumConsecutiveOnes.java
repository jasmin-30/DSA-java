package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array which has its element as only 1 or 0. we need to find maximum length of consecutive 1's.

Example:
I/P: array: [0, 1, 1, 1, 0, 1, 1]
O/P: 3
 */
public class MaximumConsecutiveOnes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        System.out.println(maxConsecutiveOnes1(arr, n));
    }


    /*
    TC: O(n^2)
    SC: O(1)
     */
    private static int maxConsecutiveOnes1(int[] arr, int n) {
        int res = 0;
        for (int i=0;i<n;i++) {
            int curr = 0;
            for (int j=i;j<n;j++) {
                if (arr[j] == 1) curr++;
                else break;
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
