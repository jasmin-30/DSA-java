package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given a query T.
for each query n, find how many numbers between range 1 - 1000000 has it's minimum prime factor as n.
n will always be a prime number.
 */
public class MinPrimeFactorN {

    static int N = 1000000;
    static int[] sieve = new int[N+1];
    static int[] counts = new int[N+1];

    static void preProcess() {
        for (int i=2;i*i<=N;++i){
            int cnt = 1;
            if(sieve[i] == 0) {
                for (int j = i*i; j<=N; j+=i) {
                    if (sieve[j] == 0) {
                        sieve[j] = -1;
                        cnt++;
                    }
                }
                sieve[i] = cnt;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        preProcess();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while(n-- > 0) {
            int t = Integer.parseInt(reader.readLine());
            System.out.println(sieve[t]);
        }
    }
}
