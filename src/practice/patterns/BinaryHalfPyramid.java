package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryHalfPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i=1;i<=n;i++) {
            int number = i % 2;
            for (int j=1;j<=i;j++) {
                System.out.print(number + " ");
                number = (number == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}
