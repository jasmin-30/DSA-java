package practice.mathematics.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AFS {
    private static int N = 1000000;
    private static long[] f= new long[N + 1];
    private static long[] series = new long[N + 1];

    private static void calculateF() {
        for (int i = 2; i<N; i++) {
            f[i] = 1;
        }

        for (int i=2;i<N;i++) {
            int j = 2;
            int n = i * j;

            while (n < N) {
                f[n] += i;
                n = i * ++j;
            }
        }
    }

    private static void preCompute() {
        calculateF();
        series[0] = series[1] = 0;
        for (int i = 2; i<=N; i++) {
            series[i] = series[i-1] + f[i];
        }
    }

    public static void main(String[] args) throws IOException {
        preCompute();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(series[n]);
        }
        reader.close();
    }
}
