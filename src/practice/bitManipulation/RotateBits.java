package practice.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Link: https://practice.geeksforgeeks.org/problems/rotate-bits4524/1/
 */
public class RotateBits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String[] str_a = reader.readLine().split(" ");
            int n = Integer.parseInt(str_a[0]);
            int d = Integer.parseInt(str_a[1]);

            List<Integer> res = rotate(n, d);
            System.out.printf("%d %d", res.get(0), res.get(1));
        }
    }

    private static ArrayList<Integer> rotate(int n, int d) {
        d = d % 16;
        int bit = 16 - d;

        ArrayList<Integer> res = new ArrayList<>(2);
        int x = n<<d | n>>bit;
        int y = n>>d | n<<bit;

        res.add(x & 65535);
        res.add(y & 65535);
        return res;
    }
}
