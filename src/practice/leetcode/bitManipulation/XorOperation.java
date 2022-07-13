package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem link: https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class XorOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            int start = Integer.parseInt(reader.readLine());

            int res = xorOperation(n, start);
            System.out.println(res);
        }
    }

    public static int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            System.out.printf("%d ", num);
            res = res ^ num;
        }

        return res;
    }
}
