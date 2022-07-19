package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem:
Given a rope of length n, you need to find maximum number of pieces you can make such that
length of every piece is in set {a, b, c} for given three values a, b and c.
If we can not cut rope in given length then return -1.

Examples:
I/P: n = 5, a = 2, b = 5, c = 1
O/P: 5

I/P: n = 23, a = 12, b = 9, c = 11
O/P: 2

I/P: n = 5, a = 4, b = 2, c = 6
O/P: -1
 */
public class RopeCutting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int a = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);
        int c = Integer.parseInt(str[3]);

        System.out.println(maxCuts(n, a, b, c));
    }

    private static int maxCuts(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;
        int res = max(maxCuts(n-a,a,b,c), maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c));
        if (res == -1)
            return -1;
        return res + 1;
    }

    private static int max(int a, int b, int c) {
        if (a >= b) {
            if (a >= c)
                return a;
            else return c;
        } else {
            if (b >= c)
                return b;
            else return c;
        }
    }
}
