package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

for n = 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */
public class NumbersHalfPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
