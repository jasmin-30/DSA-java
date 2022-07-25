package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        reverse(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    /*
    TC : O(n)
    SC: O(1)
     */
    private static void reverse(int[] arr, int n) {
        int low = 0, high = n-1;
        while (low < high) {
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
    }
}
