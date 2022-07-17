package practice.mathematics.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APS {
    private static int N = 10000000;
    private static int[] spf= new int[N + 1];
    private static long[] series = new long[N + 1];

    private static void calculateSpf() {
        for (int i=2;i<=N;i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                for (int j=2*i;j<=N;j+=i) {
                    if (spf[j] == 0) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    private static void preCompute() {
        calculateSpf();
//        System.out.println(Arrays.toString(spf));
        series[0] = series[1] = 0;
        for (int i = 2; i<=N; i++) {
            series[i] = series[i-1] + spf[i];
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
