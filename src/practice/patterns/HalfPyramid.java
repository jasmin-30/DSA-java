package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
for n = 5

        *
      * *
    * * *
  * * * *
* * * * *

 */
public class HalfPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i=n;i>0;i--) {
            for (int j=1;j<=n;j++) {
                if (j<i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
