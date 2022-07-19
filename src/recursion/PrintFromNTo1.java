package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given a number N. print numbers from N to 1 without using loop.
 */
public class PrintFromNTo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        func(n);
    }

    private static void func(int n) {
        if (n < 1)
            return;
        else {
            System.out.print(n + " ");
            func(n - 1);
        }
    }
}
