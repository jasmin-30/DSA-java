package practice.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Link: https://leetcode.com/problems/count-good-numbers/

Concept of permutation
 */
public class CountGoodNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        System.out.println(countGoodNumbers(n));
    }

    public static int countGoodNumbers(long n) {
        long evenIndices = (n + 1)/2;
        long oddIndices = n / 2;

        long result = pow(5l, evenIndices) * pow(4l, oddIndices) % 1000000007;
        return (int)result;
    }

    public static long pow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                res = (res * a) % 1000000007;

            a = (a * a) % 1000000007;
            n = n >> 1;
        }
        return res;
    }
}
