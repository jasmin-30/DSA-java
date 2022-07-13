package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Problem link: https://leetcode.com/problems/decode-xored-array/
 */
public class DecodeXoredArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] str_a = reader.readLine().split(" ");
            int first = Integer.parseInt(reader.readLine());

            int[] encoded = new int[n];
            for (int i = 0; i < n; i++) {
                encoded[i] = Integer.parseInt(str_a[i]);
            }

            int[] res = decode(encoded, first);
            System.out.println(Arrays.toString(res));
        }
    }

    public static int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        int prevElement = first;
        for (int i = 1; i <= encoded.length; i++) {
            res[i] = encoded[i-1] ^ prevElement;
            prevElement = res[i];
        }
        return res;
    }
}
