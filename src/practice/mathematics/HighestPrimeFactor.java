package practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestPrimeFactor {

    private static int N = 100000000;
    private static int[] hpf = new int[N + 1];
    public static void createSieve() {
        for (int i=2; i<=N; i++) {
            if (hpf[i] == 0) {
                hpf[i] = i;
                for (int j = 2*i; j<=N; j += i) {
                    hpf[j] = i;
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
            System.out.println(hpf[n]);
        }
    }
}
