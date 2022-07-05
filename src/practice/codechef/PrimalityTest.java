package practice.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem Link : https://www.codechef.com/problems/PRB01
 */
public class PrimalityTest {
    static int maxN = 100000;
    static boolean[] primes = new boolean[maxN + 1];

    static void createSieve() {
        primes[0] = primes[1] = true;
        for (int i = 2; i*i <= maxN; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    primes[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        createSieve();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            if (!primes[n]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
