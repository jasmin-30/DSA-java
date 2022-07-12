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
    }

    public static boolean isPowerOf2(int n) {
        if ((n & (n-1)) == 0)
            return true;

        return false;
    }
}
