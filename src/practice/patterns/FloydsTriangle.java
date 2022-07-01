package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
for n = 5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
public class FloydsTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int number = 1;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
