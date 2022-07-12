package practice.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String s = reader.readLine();
            printPowerSet(s);
        }
    }

    private static void printPowerSet(String s) {
        int n = s.length();
        int lim = (int) Math.pow(2, n);

        for (int counter = 0; counter < lim; counter++) {
            System.out.print("'");
            for (int j = 0; j<n;j++) {
                if ((counter & (1 << j))!=0)
                    System.out.print(s.charAt(j));
            }
            System.out.print("' ");
        }
    }
}
