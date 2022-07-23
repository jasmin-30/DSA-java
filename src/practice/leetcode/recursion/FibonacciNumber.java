package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(fib(n));
    }


    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-2) + fib(n-1);
    }
}
