package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeftRotationByD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int d = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        solution3(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    /*
    TC: O(n*d)
    SC: O(1)
     */
    private static void solution1(int[] arr, int n, int d) {
        for (int i=0;i<d;i++) {
            leftRotateByOne(arr, n);
        }
    }

    /*
    TC: O(n)
    SC: O(d)
     */
    private static void solution2(int[] arr, int n, int d) {
        int[] tmp = new int[d];

        for (int i=0; i<d; i++) {
            tmp[i] = arr[i];
        }

        for (int i=d;i<n;i++) {
            arr[i-d] = arr[i];
        }

        for (int i=0;i<d;i++) {
            arr[n-d+i] = tmp[i];
        }
    }

    /*
    TC: O(n)
    SC: O(1)
     */
    private static void solution3(int[] arr, int n, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    private static void leftRotateByOne(int[] arr, int n) {
        int tmp = arr[0];
        for (int i=1;i<n;i++)
            arr[i-1] = arr[i];
        arr[n-1] = tmp;
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
    }
}
