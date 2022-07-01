package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
for n = 5

1 1 1 1 1
2 2 2 2
3 3 3
4 4
5

 */
public class InvertedNumberHalfPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i=n;i>0;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print((n-i+1) + " ");
            }
            System.out.println();
        }
    }
}
