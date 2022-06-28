package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Link: https://codeforces.com/problemset/problem/1294/C
 */
public class ProductOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while(n-- > 0) {
            int t = Integer.parseInt(reader.readLine());
            solve(t);
        }
    }

    public static void solve(int n) {
        int a = n, b = n, c = n;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                a = i;
                break;
            }
        }

        n = n / a;
        for (int i = a + 1; i * i <= n; ++i) {
            if (n % i == 0) {
                b = i;
                c = n / i;
                break;
            }
        }

        if (a != b && b != c && c != 1) {
            System.out.println("YES");
            System.out.printf("%d %d %d%n", a, b, c);
        } else {
            System.out.println("NO");
        }
    }
}
