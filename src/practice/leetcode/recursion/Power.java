package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        System.out.println(myPow(n, k));
    }

    public static double myPow(double x, int n) {
        if (n < 0) return 1 / pow(x, n);
        else return pow(x, n);
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1.0;

        double ans = pow(x, n/2);

        if (n % 2 == 0) return ans * ans;
        else return x * ans * ans;
    }
}
