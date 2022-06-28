package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given number n, find all the prime numbers from 1 to n;
 */
public class PrimesTillNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while(n-- > 0) {
            int t = Integer.parseInt(reader.readLine());
            sievePrimes(t);
        }
    }

    public static void sievePrimes(int n) {
        int[] primes = new int[n + 1];

        for (int i = 2; i <= n; ++i) {
            if (primes[i] == 0) {
                System.out.printf("%d ", i);

                for (int j = i * i; j <= n; j += i) {
                    primes[j] = 1;
                }
            }
        }
        System.out.println();
    }
}
