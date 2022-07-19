package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given a string, print it's all possible subsets.

i/p: abc
o/p: "", "a", "b", "c", "ab", "ac", "bc", "abc"
 */
public class SubSetsOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        subsets(str, "", 0);
    }

    private static void subsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        subsets(str, curr, index+1);
        subsets(str, curr + str.charAt(index), index+1);
    }
}
