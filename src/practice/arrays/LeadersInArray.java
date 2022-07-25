package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array, find all the elements whose right side elements are strictly smaller than this element.
 */
public class LeadersInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        findLeaders2(arr, n);
    }

    /*
    TC: O(n^2)
    SC: O(1)
     */
    private static void findLeaders1(int[] arr, int n) {
        for (int i=0;i<n;i++) {
            boolean flag = false;
            for (int j=i+1;j<n;j++) {
                if (arr[j] >= arr[i]) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(arr[i] + " ");
        }
    }

    /*
    TC: O(n)
    SC: O(1)
     */
    private static void findLeaders2(int[] arr, int n) {
        int max = arr[n-1];
        System.out.print(max + " ");
        for (int i = n-2;i>=0;i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}
