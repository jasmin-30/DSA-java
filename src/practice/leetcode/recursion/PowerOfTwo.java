package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n==2 || n == 1)
            return true;
        if (n <= 0 || n%2 != 0)
            return false;

        return isPowerOfTwo(n/2);

    }
}
