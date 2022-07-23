package practice.leetcode.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        char[] array = new char[n];
        for (int i=0;i<n;i++)
            array[i] = str[i].charAt(0);

        reverseString(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public static void reverse(char[] s, int start, int end) {
        if (start >= end)
            return;

        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
        reverse(s, start + 1, end - 1);
    }
}
