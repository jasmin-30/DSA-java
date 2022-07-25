package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeftRotationByOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }
        leftRotate(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotate(int[] arr, int n) {
        int tmp = arr[0];
        for (int i=1;i<n;i++)
            arr[i-1] = arr[i];
        arr[n-1] = tmp;
    }
}
