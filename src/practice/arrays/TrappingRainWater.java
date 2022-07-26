package practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainWater {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str_a = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str_a[i]);
        }

        System.out.println(getWater1(arr, n));
    }

    /*
    TC: O(n^2)
    SC: O(1)
     */
    private static int getWater1(int[] arr, int n) {
        int res = 0;

        for (int i=1;i<n-1;i++) {
            int lMax = arr[i];
            for (int j=0;j<i;j++)
                lMax = Math.max(lMax, arr[j]);

            int rMax = arr[i];
            for(int j=i+1;j<n;j++)
                rMax = Math.max(rMax, arr[j]);

            res += Math.min(lMax, rMax) - arr[i];
        }

        return res;
    }
}
