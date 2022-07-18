package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumFlipsToMakeAOrBEqualC {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str_a = reader.readLine().split(" ");
        int a = Integer.parseInt(str_a[0]);
        int b = Integer.parseInt(str_a[1]);
        int c = Integer.parseInt(str_a[2]);
        System.out.println(minFlips(a, b, c));
    }

    public static int minFlips(int a, int b, int c) {
        int count = 0;
        while (c != 0 || a!=0 || b!=0) {
            if ((c & 1) == 1) {
                if ((a&1)==0 && (b&1)==0)
                    count += 1;
            } else {
                if ((a&1)==1 && (b&1)==1)
                    count += 2;
                else if ((a&1)==1 || (b&1)==1)
                    count += 1;
            }
            c >>= 1;
            a >>= 1;
            b >>= 1;
        }
        return count;
    }
}

