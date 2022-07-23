package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinnerOfTheCircularGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        System.out.println(findTheWinner(n, k));
    }

    public static int findTheWinner(int n, int k) {
        return jos(n, k) + 1;
    }

    public static int jos(int n, int k) {
        if (n == 1)
            return 0;
        return (jos(n-1, k) + k) % n;
    }
}
