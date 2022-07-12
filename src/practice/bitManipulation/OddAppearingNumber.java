package practice.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given array of n numbers. find a number which is appearing odd times.
It is given that all other element will be appearing even times.

Problem Link: https://practice.geeksforgeeks.org/problems/alone-in-couple5507/1/
 */
public class OddAppearingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] str_a = reader.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str_a[i]);
            }
            System.out.println(findOddAppearing(arr, n));
        }
    }

    public static int findOddAppearing(int[] arr, int n) {
        int res = arr[0];
        for (int i=1; i<n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
