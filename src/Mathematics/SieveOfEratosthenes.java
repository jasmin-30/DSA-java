package Mathematics;

// Most Efficient way to find prime numbers in a given range.
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sievePrimes(50);
        sievePrimes(1000);
    }

    public static void sievePrimes(int n) {
        int[] prime = new int[n + 1];

        for (int i = 2; i <= n; ++i) {
            if (prime[i] == 0) {
                System.out.printf(" %d", i);

                for (int j = i * i; j <= n; j += i)
                    prime[j] = 1;
            }
        }
        System.out.printf("%n");
    }
}
