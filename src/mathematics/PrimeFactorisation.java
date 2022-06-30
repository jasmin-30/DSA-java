package mathematics;

public class PrimeFactorisation {
    public static void main(String[] args) {
        primeFactors(125);
        primeFactors(100025);
        primeFactors(1034);
    }

    // Time complexity - O(sqrt(n))
    public static void primeFactors(int n) {
        for (int i=2;i*i<=n;++i) {
            while (n % i == 0) {
                System.out.printf("%d ", i);
                n /= i;
            }
        }
        if (n > 1) System.out.printf("%d ", n);
        System.out.println();
    }
}
