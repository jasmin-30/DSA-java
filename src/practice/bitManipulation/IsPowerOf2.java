package practice.bitManipulation;

/*
Check whether given number is power of 2.
Solution using bit manipulation. constant time.
 */
public class IsPowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(4));
        System.out.println(isPowerOf2(45));
        System.out.println(isPowerOf2(256));
        System.out.println("--------------------------------");

        System.out.println(isPowerOf2Naive(4));
        System.out.println(isPowerOf2Naive(45));
        System.out.println(isPowerOf2Naive(256));
    }

    // Theta(1)
    public static boolean isPowerOf2(int n) {
        if (n==0)
            return false;
        return (n & (n - 1)) == 0;
        // return (n!=0) && ((n & (n - 1)) == 0);
    }

    // O(log2(n))
    public static boolean isPowerOf2Naive(int n) {
        if (n == 0)
            return false;

        while (n != 1) {
            if ((n % 2) == 1)
                return false;

            n /= 2;
        }
        return true;
    }
}
