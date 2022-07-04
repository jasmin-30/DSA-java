package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
for n = 5

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */
public class PalindromicPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for(int i=1; i<=n; i++) {
            for (int j = 1; j<=(n-i);j++) {
                System.out.print("  ");
            }

            int cnt = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt-- + " ");
            }

            cnt = 2;
            for (int j = 1; j<i; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}
