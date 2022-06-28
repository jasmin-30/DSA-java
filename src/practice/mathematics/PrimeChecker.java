package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given n numbers. check whether each number is prime or not.
 */
public class PrimeChecker {
    private static int N = 1000000;
    private static boolean[] primes = new boolean[1000001];
    static {
        long startTime = System.currentTimeMillis();
        for (int i=2; i<=N; ++i) {
            primes[i] = true;
        }
        for (int i = 2; i * i <= N; ++i) {
            if (primes[i]) {
                for (int j=i*i; j<=N; j+=i) {
                    primes[j] = false;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while(n-- > 0) {
            int t = Integer.parseInt(reader.readLine());
            if (primes[t])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
