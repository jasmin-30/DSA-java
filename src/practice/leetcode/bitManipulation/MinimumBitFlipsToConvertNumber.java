package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str_a = reader.readLine().split(" ");
        int start = Integer.parseInt(str_a[0]);
        int goal = Integer.parseInt(str_a[1]);
        System.out.println(minBitFlips(start, goal));
    }

    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int res = 0;
        while (xor != 0) {
            xor = xor & xor - 1;
            res++;
        }
        return res;
    }
}
