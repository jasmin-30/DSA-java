package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
For a given string check whether string is palindrome or not.
 */
public class PalindromicString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return isPalindrome(s, start + 1, end - 1);
    }
}
