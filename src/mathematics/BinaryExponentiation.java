package mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryExponentiation {

    public static long binPowRecursive(long a, long n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return a;

        long res = binPowRecursive(a, (n/2));
        if (n%2 == 0) {
            return res * res;
        } else {
            return a * res * res;
        }
    }

    public static long binPowIterative(long a, long n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String[] str_A = reader.readLine().split(" ");
            long a = Long.parseLong(str_A[0]), n = Long.parseLong(str_A[1]);
            System.out.println(binPowIterative(a, n));
        }
    }
}
