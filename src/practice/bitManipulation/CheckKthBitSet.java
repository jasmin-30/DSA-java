package practice.bitManipulation;

public class CheckKthBitSet {
    public static void main(String[] args) {
        System.out.println(checkKthBit(5, 3));
        System.out.println(checkKthBit(5, 2));
        System.out.println(checkKthBit(10, 2));
        System.out.println(checkKthBit(10, 3));
    }

    public static boolean checkKthBit(int n, int k) {
        return (n & (1 << (k-1))) != 0;
    }
}
