package Practice;

/*
Sum of divisors of a given number
i/p: 4
o/p: 7
exp : 1 + 2 + 4 = 7

i/p: 5
o/p: 6
exp: 1 + 5 = 6
 */
public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(divisorsSum(4));
        System.out.println(divisorsSum(5));
        System.out.println(divisorsSum(100));
    }

    public static int divisorsSum(int n) {
        if (n < 0)
            return -1;

        int sum = 0;
        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += (n/i);
                }
            }
        }
        return sum;
    }
}
