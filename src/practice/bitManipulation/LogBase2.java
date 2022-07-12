package practice.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogBase2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(log2(n));
        }
    }

    private static int log2(int n) {
        int res = 0;
        while (n!=0) {
            res++;
            n = n >> 1;
        }
        return res-1;
    }
}
