package practice.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoOddAppearing {
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
            findTwoOddAppearing(arr, n);
        }
    }

    private static void findTwoOddAppearing(int[] arr, int n) {
        int xor = 0, res1 = 0, res2 = 0;
        for (int i=0;i<n;i++) xor ^= arr[i];

        int rightMostSetBit = xor & (~(xor-1));

        for (int i=0;i<n;i++) {
            if ((arr[i] & rightMostSetBit) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.printf("%d %d",res1, res2);
    }
}
