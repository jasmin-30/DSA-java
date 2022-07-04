package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
for n = 5
total no. of rows = 2 * n

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
public class Diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1;i<=n;i++) {
            for (int j=1; j<=(n-i);j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n;i>0;i--) {
            for (int j=1; j<=(n-i);j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
