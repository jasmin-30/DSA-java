package practice.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Problem Link: https://www.codechef.com/submit/RIFFLES

This is solved in O(N) time complexity. However we can solve this using binary exponentiation technique in O(NlogN) time complexity
 */
public class RIFFLES {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String[] str_A = reader.readLine().split(" ");
            int n = Integer.parseInt(str_A[0]), k = Integer.parseInt(str_A[1]);
            solve(n, k);
        }
    }

    private static void solve(int n, int k) {
        int[] nextPos = new int[n+1];
        int[] visited = new int[n+1];
        int[] ans = new int[n+1];

        int index = 1;
        for (int i = 1; i <= n; i += 2) nextPos[i] = index++;
        for (int i = 2; i <= n; i += 2) nextPos[i] = index++;

        //System.out.println(Arrays.toString(nextPos));

        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                List<Integer> cycle = new ArrayList<>();
                decompose(i, visited, cycle, nextPos);
                int len = cycle.size();
                for (int j = 0; j < len; j++) {
                    ans[cycle.get((j + k) % len)] = cycle.get(j);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    private static void decompose(int src, int[] visited, List<Integer> cycle, int[] nextPos) {
        if (visited[src] == 1) return;
        cycle.add(src);
        visited[src] = 1;
        decompose(nextPos[src], visited, cycle, nextPos);
    }
}
