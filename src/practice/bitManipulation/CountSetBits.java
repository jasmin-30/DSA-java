package practice.bitManipulation;

public class CountSetBits {
    static int[] table = new int[256];
    public static void main(String[] args) {
        System.out.println(solution1(5));
        System.out.println(solution1(10));
        System.out.println(solution1(15));
        System.out.println("---------------------------");

        System.out.println(solution2(5));
        System.out.println(solution2(10));
        System.out.println(solution2(15));
        System.out.println("---------------------------");

        preCompute();
        System.out.println(solution3(5));
        System.out.println(solution3(10));
        System.out.println(solution3(15));
    }

    // Naive Solution
    // We check last bit if it is set or not. If it is set, we increment the count and discard last bit using right shift.
    // Time complexity: Theta(32)
    public static int solution1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;

            n >>= 1;
        }
        return count;
    }

    // Brian Kerningam's algorithm
    // Time Complexity: Theta(Set bits in N)
    public static int solution2(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    // PreComputation for solution3
    public static void preCompute() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
    }

    // Constant time
    // precomputation is required.
    //PreComputed table has counts of bit set in numbers from 0 to 255
    public static int solution3(int n) {
        int res = table[n & 0xff];
        n >>= 8;

        res += table[n & 0xff];
        n >>= 8;

        res += table[n & 0xff];
        n >>= 8;

        res += table[n & 0xff];
        return res;
    }
}
