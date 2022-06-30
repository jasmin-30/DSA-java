package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
Problem Link: https://www.spoj.com/problems/TDKPRIME/
 */
public class TDKPRIME {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int N = 86028121;
    static boolean[] sieve = new boolean[N+1];
    static int[] primes = new int[N+1];

    static void createSieve() {
        for (int i=2; i*i<=N;++i) {
            if (!sieve[i]) {
                for (int j=i*i;j<=N;j+=i)
                    sieve[j] = true;
            }
        }

        int j = 0;
        for (int i=2;i<=N;++i) {
            if (!sieve[i])
                primes[j++] = i;
        }
    }

    public static void main(String[] args) throws IOException {
        createSieve();
        FastReader reader = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int q = reader.nextInt();
        while(q-- > 0) {
            int t = reader.nextInt();
            out.println(primes[t-1]);
        }
        out.close();
    }
}
