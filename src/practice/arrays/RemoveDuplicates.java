package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        int newSize = removeDuplicates(arr, n);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
    TC: O(n)
    SC: O(1)
     */
    private static int removeDuplicates(int[] arr, int n) {
        int res = 1;
        for (int i=1;i<n;i++) {
            if (arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
