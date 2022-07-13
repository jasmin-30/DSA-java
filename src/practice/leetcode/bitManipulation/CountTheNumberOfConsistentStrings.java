package practice.leetcode.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Problem link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String allowed = reader.readLine();
            String[] words = reader.readLine().split(" ");

            Solution obj = new Solution();
            int res = obj.countConsistentStrings(allowed, words);
            System.out.println(res);
        }
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int allowedChars = 0;
        for (int i = 0; i<allowed.length();i++) {
            allowedChars = allowedChars | (1 << (allowed.charAt(i) - 'a'));
        }

        for (String word : words) {
            boolean consistent = true;
            for (int i = 0;i < word.length(); i++) {
                if ((allowedChars & (1 << (word.charAt(i) - 'a'))) == 0) {
                    consistent = false;
                    break;
                }
            }
            if(consistent)
                count++;
        }
        return count;
    }
}