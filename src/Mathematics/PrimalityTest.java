package Mathematics;

public class PrimalityTest {
    public static void main(String[] args) {
        System.out.println(solution1(37));
        System.out.println(solution1(11));
        System.out.println(solution2(1327));
        System.out.println(solution3(93329));
    }

    // Time Complexity: O(n)
    public static boolean solution1(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Time Complexity : O(sqrt(n))
    public static boolean solution2(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i < n; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Optimized than O(sqrt(n))
    public static boolean solution3(int n) {
        if (n == 2 || n == 3)
            return true;
        if ((n % 2 == 0) || (n % 3 == 0))
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if ((n % i == 0) || (n % (i + 2)) == 0)
                return false;
        }
        return true;
    }
}
