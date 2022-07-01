package practice.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HollowRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());
        int cols = Integer.parseInt(reader.readLine());

        for (int i=1;i<=rows;i++) {
            for (int j=1;j<=cols;j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
