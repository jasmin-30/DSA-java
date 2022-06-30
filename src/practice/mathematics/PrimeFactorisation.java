package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
You are given T queries.
For each test case write it's prime factorisation.
 */
public class PrimeFactorisation {

    static int N = 1000000;
    static int[] spf = new int[N + 1];

    static void createSieve() {
        for (int i=2;i*i<=N;++i) {
            if (spf[i]==0) {
                spf[i] = i;
                for (int j=i*i;j<=N;j+=i) {
                    if (spf[j] == 0)
                        spf[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        createSieve();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            while(n != 1) {
                int factor = PrimeFactorisation.spf[n];
                System.out.printf("%d ", factor);
                n /= factor;
            }
        }
    }
}
