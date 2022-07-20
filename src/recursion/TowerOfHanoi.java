package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
We have three towers A, B and C. Initially we have n disks in tower A.
We need to move these disks from tower A to C such that,
1. We can move only one disk at a time.
2. No larger disk can be placed above smaller disk
3. Only the top disk can be moved at a time.
4. we can use remaining tower as auxiliary tower to move disks from source tower to destination tower.
 */
public class TowerOfHanoi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        TOH(n, "A", "C", "B");
    }

    private static void TOH(int n, String s, String d, String aux) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from tower " + s + " to " + d);
            return;
        }

        TOH(n-1, s, aux, d);
        System.out.println("Move disk " + n + " from tower " + s + " to " + d);
        TOH(n-1, aux, d, s);
    }


}
