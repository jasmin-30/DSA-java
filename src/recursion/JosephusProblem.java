package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
You are given 2 numbers n and k.

We have n persons(0-indexed) sitting in circular manner, and we have to kill every kth person from current position.
so we will kill (k-1)th person in every iteration and we will hand over weapon to kth person.
We need to return position of a survivor.
 */
public class JosephusProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        System.out.println(jos(n, k));
    }

    private static int jos(int n, int k) {
        if (n==1)
            return 0;

        return (jos(n-1, k) + k) % n;
    }
}
