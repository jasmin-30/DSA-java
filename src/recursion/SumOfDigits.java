package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given a number n. Find the sum of all it's digits.
 */
public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        if (num < 10)
            return num;

        return (num % 10) + sumOfDigits(num / 10);
    }
}
