package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfThree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;

        if (n%3 == 0)
            return isPowerOfThree(n/3);

        return false;
    }
}
