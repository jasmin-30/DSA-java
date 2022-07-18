package practice.mathematics.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NDIV {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str_a = reader.readLine().split(" ");
        long a = Long.parseLong(str_a[0]);
        long b = Long.parseLong(str_a[1]);
        int n = Integer.parseInt(str_a[2]);
        System.out.println(solve(a, b, n));
        reader.close();
    }

    private static long solve(long a, long b, int n) {
        int res = 0;

        for (long i = a; i<=b; i++) {
            int count = 0;
            for (long j=1;j*j<=i;j++) {
                if (i % j == 0) {
                    if (i / j == j)
                        count += 1;
                    else
                        count += 2;
                }
            }
            if (count == n)
                res+=1;
        }
        return res;
    }
}
