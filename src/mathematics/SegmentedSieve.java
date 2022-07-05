package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Mainly used in range based questions on prime

Problem: Find all prime numbers in a given range.
There are T test cases. For each test case T we are given two numbers L and R.
1 <= L,R <= 10^12
(R - L) <= 10^6;
 */
public class SegmentedSieve {

    static int N = 1000000;
    static boolean[] sieve = new boolean[N + 1];
    private static void createSieve() {
        sieve[0] = sieve[1] = true;
        for (int i = 2; i*i<=N;i++) {
            if (!sieve[i]) {
                for (int j = i * i; j <= N; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }

    static List<Integer> generatePrimes(int n) {
        List<Integer> ds = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!sieve[i])
                ds.add(i);
        }
        return ds;
    }

    public static void main(String[] args) throws IOException {
        createSieve();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0) {
            String[] str_A = reader.readLine().split(" ");
            int l = Integer.parseInt(str_A[0]), r = Integer.parseInt(str_A[1]);

            // Step 1 : generate all prime numbers till sqrt(r)
            List<Integer> primes = generatePrimes((int) Math.sqrt(r));

            // Step 2 : create dummy array of size (r-l+1)
            boolean[] dummy = new boolean[r-l+1];

            // Step 3 : Mark all multiples of all generated primes in range
            for (int pr : primes) {
                int firstMultiple = (l/pr) * pr;
                if (firstMultiple < l)
                    firstMultiple += pr;

                for (int j = Math.max(firstMultiple, pr*pr); j <= r; j+=pr) {
                    dummy[j - l] = true;
                }
            }

            // Step 4 : get all prime numbers from dummy array
            
            // handling case where l = 1, so first number in range which is will not be marked as prime.
            if (l == 1)
                dummy[0] = true;

            for (int i = l; i <= r; i++) {
                if (!dummy[i-l]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
