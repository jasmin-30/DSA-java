package practice.mathematics.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NDIV {
    private static int maxN = 100000;
    private static boolean[] primes = new boolean[maxN + 1];
    private static int[] primeSieve = new int[maxN+1];

    private static void createSieve() {
        int k=0;
        for (int i=2;i*i<=maxN;i++) {
            if (!primes[i]) {
                primeSieve[k++] = i;
                for (int j=2*i;j<=maxN;j+=i) {
                    primes[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        createSieve();
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
            int count = 1;
            long num = i;
            long primeFactor = primeSieve[0];
            int k = 1;
            while (primeFactor * primeFactor <=num) {
                int cnt = 0;
                while (num % primeFactor == 0) {
                    cnt++;
                    num = num / primeFactor;
                }
                count = count * (cnt + 1);
                primeFactor = primeSieve[k++];
            }
            if (num != 1) count *= 2;

            if (count == n)
                res+=1;
        }
        return res;
    }
}
