package practice.bitManipulation;

public class CheckKthBitSet {
    public static void main(String[] args) {
        System.out.println(checkKthBitUsingLeftShift(5, 3));
        System.out.println(checkKthBitUsingLeftShift(5, 2));
        System.out.println(checkKthBitUsingRightShift(10, 2));
        System.out.println(checkKthBitUsingRightShift(10, 3));
    }

    public static boolean checkKthBitUsingLeftShift(int n, int k) {
        return (n & (1 << (k-1))) != 0;
    }

    public static boolean checkKthBitUsingRightShift(int n, int k) {
        return ((n >> (k-1)) & 1) == 1;
    }
}
